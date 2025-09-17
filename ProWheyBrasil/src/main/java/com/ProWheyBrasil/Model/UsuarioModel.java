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
    private Integer idUsuario;
    @Column(unique = true)
    @Email private String emailUsuario;
    @Column(name = "SENHAUSUARIO")
    private String senhaUsuario;
}
