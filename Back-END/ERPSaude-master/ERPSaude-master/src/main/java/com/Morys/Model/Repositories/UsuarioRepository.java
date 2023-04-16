package com.Morys.model.Repositories;

import com.Morys.model.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {


    @Query("SELECT u FROM Usuario u WHERE u.email = :email OR u.login = :login")
    Optional<Usuario> findByEmailOrNome(@Param("email") String email, @Param("login") String login);


}

