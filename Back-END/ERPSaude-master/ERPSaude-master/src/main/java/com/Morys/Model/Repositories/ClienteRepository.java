package com.Morys.model.Repositories;

import com.Morys.model.Entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    Cliente findByCodigo(Integer codigo);
}
