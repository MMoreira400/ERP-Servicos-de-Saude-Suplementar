package com.Morys.model.Entities.Classes;

import com.Morys.model.Entities.Prestador;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Classe_Prestador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String Codigo;
    private String Termo;

    public Classe_Prestador(String codigo, String termo) {
        this.Codigo = codigo;
        this.Termo = termo;
    }

    public Classe_Prestador(int ID, String codigo, String termo, List<Prestador> prestador) {
        this.setID(ID);
        this.Codigo = codigo;
        this.Termo = termo;
    }


    public Classe_Prestador() {
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public String getTermo() {
        return Termo;
    }

    public void setTermo(String termo) {
        Termo = termo;
    }


    
}
