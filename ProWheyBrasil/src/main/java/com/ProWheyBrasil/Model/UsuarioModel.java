package com.ProWheyBrasil.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TBUSUARIOS")
public class UsuarioModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDUSUARIO")
    private Integer idUsuario;
    @Column(name = "NOMEUSUARIO")
    private String nomeUsuario;
    @Column(name = "EMAILUSUARIO")
    @Email private String emailUsuario;
    @Column(name = "SENHAUSUARIO")
    private String senhaUsuario;
    @Column(name = "ENDERECOUSUARIO")
    private String enderecoUsuario;
    @Column(name = "CPFUSUARIO")
    private String cpfUsuario;
    @Column(name = "TELEFONEUSUARIO")
    private String telefoneUsuario;
}
