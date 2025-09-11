package com.ProWheyBrasil.Controller;

import com.ProWheyBrasil.Dto.UsuarioDto;
import com.ProWheyBrasil.Model.UsuarioModel;
import com.ProWheyBrasil.Repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
    @Autowired
    public UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<UsuarioModel> cadastrarUsuario(@RequestBody @Valid UsuarioDto usuarioDto){
        var usuarios = new UsuarioModel();
        BeanUtils.copyProperties(usuarioDto, usuarios);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                usuarioRepository.save(usuarios));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioModel>> getAllUsuarios(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.findAll());
    }

    @GetMapping("/idUsuario")
    public ResponseEntity<Object> getUsuarioById(@PathVariable(value = "idUsuario") Integer idUsuario){
        Optional<UsuarioModel> usuario0 = usuarioRepository.findById(idUsuario);
        if (usuario0.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não cadastrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(usuario0.get());
    }
}
