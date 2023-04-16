package com.Morys.model.Entities;

import jakarta.persistence.*;
import java.util.List;
@Entity
public class Solicitacao {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    @ManyToOne(targetEntity = Cliente.class)
    private Cliente cliente;
    @ManyToOne(targetEntity = Prestador.class)
    private Prestador prestador;
    @ManyToMany(targetEntity = Procedimento.class)
    private List<Procedimento> procedimentos;
    @Enumerated(EnumType.STRING)
    private StatusSolicitacao statusSolicitacao = StatusSolicitacao.NOVO;


    public Solicitacao() {
    }


    public Solicitacao(Cliente cliente, Prestador prestador, List<Procedimento> procedimentos) {
        this.cliente = cliente;
        this.prestador = prestador;
        this.procedimentos = procedimentos;
        this.statusSolicitacao = StatusSolicitacao.NOVO;
    }

    public Long getId() {
        return Id;
    }


    public Prestador getPrestador() {
        return prestador;
    }


    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public List<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(List<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public StatusSolicitacao getStatusSolicitacao() {
        return statusSolicitacao;
    }

    public void setStatusSolicitacao(StatusSolicitacao statusSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
