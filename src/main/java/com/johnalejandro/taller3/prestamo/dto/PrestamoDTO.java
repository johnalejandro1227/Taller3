package com.johnalejandro.taller3.prestamo.dto;

import com.johnalejandro.taller3.Usuario.dto.UsuarioIdDTO;
import com.johnalejandro.taller3.libro.dto.LibroIdDto;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PrestamoDTO {

    private UsuarioIdDTO idUsuario;
    private LibroIdDto idLibro;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private boolean prestado;

}
