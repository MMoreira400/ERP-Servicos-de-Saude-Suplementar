package com.Morys.model.Entities.Classes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Classe_Solicitacao {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String Codigo;
    private String Termo;

    public Integer getID() {
        return ID;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getTermo() {
        return Termo;
    }

    public void setTermo(String termo) {
        Termo = termo;
    }
}
