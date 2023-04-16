package com.Morys.model.Entities;

import jakarta.persistence.*;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Pessoa {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String CPFCNPJ;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date nascimento;
    private Date data_criacao = new Date();
    private Date data_atualizacao;
    private String observacao;


    public Pessoa() {
    }

    public Pessoa(String CPFCNPJ, Date nascimento, Date data_atualizacao, String observacao) {
        this.CPFCNPJ = CPFCNPJ;
        this.nascimento = nascimento;
        this.data_atualizacao = data_atualizacao;
        this.observacao = observacao;
    }

    public Long getId() {
        return Id;
    }

    public String getCPFCNPJ() {
        return CPFCNPJ;
    }

    public void setCPFCNPJ(String CPFCNPJ) {
        this.CPFCNPJ = CPFCNPJ;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }

    public Date getData_atualizacao() {
        return data_atualizacao;
    }

    public void setData_atualizacao(Date data_atualizacao) {
        this.data_atualizacao = data_atualizacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
