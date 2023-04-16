package com.Morys.model.Repositories;

import com.Morys.model.Entities.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestadorRepository extends JpaRepository<Prestador,Long> {
    Prestador findByCodigo(Integer codigo);
}
