package com.johnalejandro.taller3.Usuario.repository;

import com.johnalejandro.taller3.Usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

        }