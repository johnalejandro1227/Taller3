package com.johnalejandro.taller3.prestamo.repository;

import com.johnalejandro.taller3.prestamo.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

        }