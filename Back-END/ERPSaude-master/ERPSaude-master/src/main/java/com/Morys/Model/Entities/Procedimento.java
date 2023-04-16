package com.Morys.model.Entities;

import com.Morys.model.Entities.Classes.Classe_Procedimento;
import jakarta.persistence.*;

@Entity
public class Procedimento {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @ManyToOne(targetEntity = Classe_Procedimento.class)
    @JoinColumn(name = "classe")
    private Classe_Procedimento Classe;
    private Integer codigo;
    private String nome;


    public Procedimento() {
    }

    public Procedimento(Classe_Procedimento classe, Integer codigo, String nome) {
        Classe = classe;
        this.codigo = codigo;
        this.nome = nome;
    }

    public Long getID() {
        return ID;
    }

    public Classe_Procedimento getClasse() {
        return Classe;
    }

    public void setClasse(Classe_Procedimento classe) {
        Classe = classe;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }
}
