package com.johnalejandro.taller3.Usuario.dto;



import com.johnalejandro.taller3.persona.dto.PersonaIdDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {

    private PersonaIdDTO idPersona;
    private String rol;

}