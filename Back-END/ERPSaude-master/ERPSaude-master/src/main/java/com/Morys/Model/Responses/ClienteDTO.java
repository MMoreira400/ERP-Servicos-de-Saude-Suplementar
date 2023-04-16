package com.Morys.model.Responses;

import com.Morys.model.Entities.Cliente;

public class ClienteDTO {
    private Integer codigo;
    private String nome;

    public ClienteDTO() {
    }

    public Integer getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }



    public ClienteDTO(Cliente cliente) {
        this.codigo = cliente.getCodigo();
        this.nome = cliente.getNome();
    }

}
