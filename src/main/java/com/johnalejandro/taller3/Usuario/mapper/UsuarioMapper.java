package com.johnalejandro.taller3.Usuario.mapper;

import com.johnalejandro.taller3.Usuario.dto.UsuarioDTO;
import com.johnalejandro.taller3.Usuario.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioDTO usuarioTousuarioDTO(Usuario usuario);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "idPersona.nombre", ignore = true)
    @Mapping(target = "idPersona.apellido", ignore = true)
    @Mapping(target = "idPersona.sexo", ignore = true)
    Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO);
}
