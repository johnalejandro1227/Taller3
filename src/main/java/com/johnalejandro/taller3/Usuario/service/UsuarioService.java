package com.johnalejandro.taller3.Usuario.service;

import com.johnalejandro.taller3.Usuario.dto.UsuarioDTO;
import com.johnalejandro.taller3.Usuario.dto.UsuarioRolDTO;
import com.johnalejandro.taller3.Usuario.mapper.UsuarioMapper;
import com.johnalejandro.taller3.Usuario.model.Usuario;
import com.johnalejandro.taller3.Usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioMapper usuarioMapper;

    //Crear un usuario.
    public Usuario createUserFromDTO(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioMapper.usuarioDTOToUsuario(usuarioDTO);
        return usuarioRepository.save(usuario);
    }

    //Obtener todos los usuarios.
    public List<Usuario> getAllUsers() {
        return usuarioRepository.findAll();
    }

    //Obtener usuario por Id.
    public Optional<Usuario> getUserById(Long id) {
        return usuarioRepository.findById(id);
    }

    //Actualizar un usuario.
    public Usuario updateUserFromDTO(Long id, UsuarioRolDTO usuarioDetails) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();
        usuario.setRol(usuarioDetails.getRol());
        return usuarioRepository.save(usuario);
    }

    //Eliminar un usuario.
    public void deleteUser(Long id) {
        usuarioRepository.deleteById(id);
}
}
