package com.Morys.util;

import com.Morys.model.Entities.Prestador;
import com.Morys.model.Entities.Solicitacao;
import com.Morys.model.Repositories.PrestadorRepository;

import java.util.Optional;

public class CriticaSolicitacao {

    public CriticaSolicitacao() {
    }

    /* CRÍTICAS */

    public final boolean validaPrestadorSolicitacao(Solicitacao solicitacao, PrestadorRepository prestadorRepository){

        Optional<Prestador> prestador = prestadorRepository.findById(solicitacao.getPrestador().getId());

        if(prestador.isPresent()){
            return true;
        }

        return false;

    }


}
