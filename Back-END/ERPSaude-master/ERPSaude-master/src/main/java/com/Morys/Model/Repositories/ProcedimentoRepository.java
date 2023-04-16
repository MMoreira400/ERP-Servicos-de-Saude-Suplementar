package com.Morys.model.Repositories;

import com.Morys.model.Entities.Procedimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento,Long> {

    Procedimento findByCodigo(Integer codigo);

}
