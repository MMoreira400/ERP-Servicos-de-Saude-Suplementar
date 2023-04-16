package com.Morys.model.Requests;

import com.Morys.model.Responses.ClienteDTO;
import com.Morys.model.Responses.PrestadorDTO;
import com.Morys.model.Responses.ProcedimentoDTO;

import java.util.List;

public class RegistrarSolicitacaoRequest {

    private ClienteDTO cliente;
    private PrestadorDTO prestador;
    private List<ProcedimentoDTO> procedimentos;

    public RegistrarSolicitacaoRequest() {
    }

    public RegistrarSolicitacaoRequest(ClienteDTO cliente, PrestadorDTO prestador, List<ProcedimentoDTO> procedimentos) {
        this.cliente = cliente;
        this.prestador = prestador;
        this.procedimentos = procedimentos;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public PrestadorDTO getPrestador() {
        return prestador;
    }

    public List<ProcedimentoDTO> getProcedimentos() {
        return procedimentos;
    }
}
