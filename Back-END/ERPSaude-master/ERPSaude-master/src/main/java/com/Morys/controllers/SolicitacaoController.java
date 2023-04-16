package com.Morys.controllers;


import com.Morys.model.Entities.*;
import com.Morys.model.Repositories.*;
import com.Morys.model.Responses.ProcedimentoDTO;
import com.Morys.model.Requests.RegistrarSolicitacaoRequest;
import com.Morys.model.Responses.SolicitacaoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiSolicitacao")
public class SolicitacaoController {
    @Autowired
    SolicitacaoRepository solicitacaoRepository;
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    PrestadorRepository prestadorRepository;
    @Autowired
    ProcedimentoRepository procedimentoRepository;
    @Autowired
    PessoaRepository pessoaRepository;

    @PostMapping("/registraSolicitacao")
    public ResponseEntity registraSolicitacao(@RequestBody RegistrarSolicitacaoRequest request, UriComponentsBuilder uriBuilder){


            Cliente cliente = clienteRepository.findByCodigo(request.getCliente().getCodigo());
            Prestador prestador = prestadorRepository.findByCodigo(request.getPrestador().getCodigo());
            List<ProcedimentoDTO> procedimentoDTOList = request.getProcedimentos();
            List<Procedimento> procedimentos = new ArrayList<>();
             procedimentoDTOList.forEach(procedimentoDTO -> {
                 procedimentos.add(procedimentoRepository.findByCodigo(procedimentoDTO.getCodigo()));
             });

             if(cliente != null
                && prestador != null){
                 Solicitacao solicitacao = solicitacaoRepository.saveAndFlush(new Solicitacao(cliente, prestador,procedimentos));

                 URI uri = uriBuilder.path("/apiSolicitacao/{id}").buildAndExpand(solicitacao.getId()).toUri();

                 return ResponseEntity.created(uri).body(SolicitacaoDTO.toSolicitacaoDTO(solicitacao));

             }else{
                 return ResponseEntity.badRequest().build();
             }



    }

    @GetMapping("/{id}")
    public ResponseEntity retornaRegistroSolicitacao(@PathVariable Long id){

         Optional<Solicitacao> solicitacao = solicitacaoRepository.findById(id);

         if(solicitacao.isPresent()){
             return ResponseEntity.ok().body(solicitacao);
         }

         return ResponseEntity.notFound().build();

    }

    @GetMapping("/pessoa")
    public Pessoa testePessoa(){
        pessoaRepository.saveAndFlush(new Pessoa("123456789",new Date("09/09/2023"),null,"teste Ti"));
        return new Pessoa("123456789",new Date("09/09/2023"),null,"teste Ti");
    }

}
