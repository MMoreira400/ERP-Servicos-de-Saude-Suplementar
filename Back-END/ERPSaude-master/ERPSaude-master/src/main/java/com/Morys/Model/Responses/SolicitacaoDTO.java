package com.Morys.model.Responses;

import com.Morys.model.Entities.Procedimento;
import com.Morys.model.Entities.Solicitacao;

import java.util.List;

public class SolicitacaoDTO {
    private ClienteDTO cliente;
    private PrestadorDTO prestador;
    private List<ProcedimentoDTO> procedimentos;

    public SolicitacaoDTO(ClienteDTO cliente, PrestadorDTO prestador, List<ProcedimentoDTO> procedimentos) {
        this.cliente = cliente;
        this.prestador = prestador;
        this.procedimentos = procedimentos;
    }

    public SolicitacaoDTO() {
    }

    public final static SolicitacaoDTO toSolicitacaoDTO(Solicitacao solicitacao){
        SolicitacaoDTO solicitacaoDTO = new SolicitacaoDTO();
        solicitacaoDTO.setCliente(new ClienteDTO(solicitacao.getCliente()));
        solicitacaoDTO.setPrestador(new PrestadorDTO(solicitacao.getPrestador()));
        solicitacaoDTO.setProcedimentos(solicitacao.getProcedimentos().stream().map((Procedimento t) -> new ProcedimentoDTO(t)).toList());
        return solicitacaoDTO;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public PrestadorDTO getPrestador() {
        return prestador;
    }

    public void setPrestador(PrestadorDTO prestador) {
        this.prestador = prestador;
    }

    public List<ProcedimentoDTO> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(List<ProcedimentoDTO> procedimentos) {
        this.procedimentos = procedimentos;
    }
}
