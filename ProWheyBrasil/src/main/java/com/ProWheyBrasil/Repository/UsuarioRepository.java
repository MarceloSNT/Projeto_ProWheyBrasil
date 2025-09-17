package com.ProWheyBrasil.Repository;

import com.ProWheyBrasil.Model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, String> {

    Optional<UsuarioModel> findAllByEmailUsuario(String emailUsuario);
    Optional<UsuarioModel> findByEmailUsuario(String emailUsuario);
}
