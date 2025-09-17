package com.ProWheyBrasil.dto;

import jakarta.validation.constraints.*;

public record UsuarioDto(

        @NotNull(message = "O email do ususario não pode estar vazio")
        @NotBlank(message = "O email não pode ser estar vazio")
        @Email(message = "O email não esta formatado corretamente")
        String emailUsuario,

        @NotNull(message = "O email do ususario não pode estar vazio")
        @NotBlank(message = "A senha do usuário não pode estar vazia")
        @Size(min = 6, message = "A senha deve ter no minimo 6 caracteres")
        String senhaUsuario)
{}
