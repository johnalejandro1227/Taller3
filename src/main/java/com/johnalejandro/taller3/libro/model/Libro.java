package com.johnalejandro.taller3.libro.model;

import com.johnalejandro.taller3.prestamo.model.Prestamo;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String autor;
    private String isbn;
    private String titulo;

    @OneToOne(mappedBy = "idLibro", cascade = CascadeType.REMOVE)
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private Prestamo prestamo;



}
