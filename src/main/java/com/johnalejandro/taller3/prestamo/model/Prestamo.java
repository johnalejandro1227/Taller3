package com.johnalejandro.taller3.prestamo.model;

import com.johnalejandro.taller3.Usuario.model.Usuario;
import com.johnalejandro.taller3.libro.model.Libro;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "prestamo")
@Getter
@Setter
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario idUsuario;

    @ManyToOne
    @JoinColumn(name = "id_libro")
    private Libro idLibro;

    @Temporal(TemporalType.DATE)
    private Date fechaPrestamo;

    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;

    private boolean prestado;

}