package com.Morys.model.Responses;

import com.Morys.model.Entities.Procedimento;

public class ProcedimentoDTO {
    private Integer codigo;
    private String nome;

    public ProcedimentoDTO(Procedimento t) {
        this.codigo = t.getCodigo();
        this.nome = t.getNome();
    }


    public ProcedimentoDTO() {
    }

    @Override
    public String toString() {
        return "ProcedimentoDTO{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }

    public ProcedimentoDTO(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
