package com.johnalejandro.taller3.persona.repository;

import com.johnalejandro.taller3.persona.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository  extends JpaRepository<Persona, Long>{

        }
