package com.ProWheyBrasil.Controller;

import com.ProWheyBrasil.Dto.UsuarioDto;
import com.ProWheyBrasil.Model.UsuarioModel;
import com.ProWheyBrasil.Repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
    @Autowired
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioController(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/saveUser")
    public ResponseEntity<UsuarioModel> cadastrarUsuario(@RequestBody @Valid UsuarioModel usuarioModel){
        usuarioModel.setSenhaUsuario(passwordEncoder.encode(usuarioModel.getSenhaUsuario()));
        return ResponseEntity.ok(usuarioRepository.save(usuarioModel));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<UsuarioModel>> getAllUsuarios(){
        return ResponseEntity.ok(usuarioRepository.findAll());
    }

    @GetMapping("/validarLogin")
    public ResponseEntity<Object> getUsuarioById(@RequestParam String emailUsuario, @RequestParam String senhaUsuario){
        Optional<UsuarioModel> usuario0 = usuarioRepository.findAllByEmailUsuario(emailUsuario);
        if (usuario0.isEmpty()){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuário não cadastrado");
        }
        boolean valid = passwordEncoder.matches(senhaUsuario, usuario0.get().getSenhaUsuario());

        HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
        return ResponseEntity.status(status).body(valid);
    }
}
/*public ResponseEntity<Boolean> validarSenha(@RequestParam String login,@RequestParam String password){
    Optional<UsuarioModel> optUsuario = usuarioRepository.findByLogin(login);
    if (optUsuario.isEmpty()){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
    }
    boolean valid = passwordEncoder.matches(password, optUsuario.get().getPassword());

    HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
    return ResponseEntity.status(status).body(valid);
*/
