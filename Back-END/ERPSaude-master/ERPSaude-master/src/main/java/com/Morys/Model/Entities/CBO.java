package com.Morys.model.Entities;

import jakarta.persistence.*;

@Entity
public class CBO {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10,nullable = false,unique = true)
    private String codigo;
    private String termo;

    public CBO() {
    }

    public CBO(String codigo, String termo) {
        this.codigo = codigo;
        this.termo = termo;
    }

    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }
}
