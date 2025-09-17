package com.ProWheyBrasil.service;

import com.ProWheyBrasil.model.UsuarioModel;
import com.ProWheyBrasil.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;


    public List<UsuarioModel> getAllUsuarios() {
        return repository.findAll();
    }

    public Optional<UsuarioModel> findUsuarioById(Integer idUsuario) {
        return repository.findById(idUsuario);
    }

    public UsuarioModel postUsuario(UsuarioModel usuarioModel) {
        return repository.save(usuarioModel);
    }

}
