package com.Morys.controllers;


import com.Morys.model.Entities.Usuario;
import com.Morys.model.Repositories.UsuarioRepository;
import com.Morys.model.Requests.CadastroUsuarioForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping(value = "/usuariosAPI")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping(value = "/registrarUsuario",
                    consumes = MediaType.APPLICATION_JSON_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity cadastrarNovoUsuario(@RequestBody CadastroUsuarioForm form, UriComponentsBuilder uriComponentsBuilder){

        Usuario novoUsuario = new Usuario(form.getEmail(),form.getLogin(),form.getSenha());

        novoUsuario = usuarioRepository.saveAndFlush(novoUsuario);

        URI uri = uriComponentsBuilder.path("/usuario/{id}").buildAndExpand(novoUsuario.getId()).toUri();

        return ResponseEntity.created(uri).body(novoUsuario);

    }

    @GetMapping("/{id}")
    public ResponseEntity buscaUsuarioPorId(@PathVariable Long id){
        Optional<Usuario> usuario= usuarioRepository.findById(id);

        if(usuario.isPresent()){
            return ResponseEntity.ok(usuario);
        }else{
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping(value = "/buscaUsuarioEmailOuNome")
    public HttpStatus buscarUsuarioPorEmailOuNome(String email, String nome) {

        Optional<Usuario> usuario = usuarioRepository.findByEmailOrNome(email, nome);

        return (usuario.isPresent())?  HttpStatus.CONFLICT : HttpStatus.NOT_FOUND;
    }


}
