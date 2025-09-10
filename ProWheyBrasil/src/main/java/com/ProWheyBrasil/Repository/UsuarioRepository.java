package com.ProWheyBrasil.Repository;

import com.ProWheyBrasil.Model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioModel,Integer> {

    Optional<UsuarioModel> findAllByUsuarioId(Integer idUsuario);
    Optional<UsuarioModel> findByIdUsuario(Integer idUsuario);
}
