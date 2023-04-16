package com.Morys.model.Entities;

import com.Morys.model.Entities.Classes.Classe_Prestador;
import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Prestador {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne(targetEntity = Classe_Prestador.class)
    @JoinColumn(name = "classe")
    private Classe_Prestador classe;
    @Column(length = 10,nullable = false,unique = true)
    private Integer codigo;
    private String nome;
    @ManyToOne(targetEntity = CBO.class)
    @JoinColumn(name = "CBO")
    private CBO cbo;

    private Date data_criacao = new Date();
    private Date data_atualizacao;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa")
    private Pessoa pessoa;

    public Prestador() {
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }



    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getId() {
        return Id;
    }

    public Classe_Prestador getClasse() {
        return classe;
    }

    public void setClasse(Classe_Prestador classe) {
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CBO getCbo() {
        return cbo;
    }

    public void setCbo(CBO cbo) {
        this.cbo = cbo;
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
}
