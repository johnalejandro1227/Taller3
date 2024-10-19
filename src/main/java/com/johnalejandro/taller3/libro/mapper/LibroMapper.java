package com.johnalejandro.taller3.libro.mapper;

import com.johnalejandro.taller3.libro.dto.LibroDTO;
import com.johnalejandro.taller3.libro.model.Libro;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LibroMapper {

    LibroDTO libroTolibroDTO(Libro libro);

    @Mapping(target = "id", ignore = true)
    Libro libroDTOToLibro(LibroDTO libroDTO);
}
