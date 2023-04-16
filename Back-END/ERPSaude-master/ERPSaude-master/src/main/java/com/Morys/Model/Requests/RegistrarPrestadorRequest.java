package com.Morys.model.Requests;

public class RegistrarPrestadorRequest {
    private int classe;
    private String nome;
    private Integer codigo;
    private String cpf;

    public Integer getCodigo() {
        return codigo;
    }


    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
