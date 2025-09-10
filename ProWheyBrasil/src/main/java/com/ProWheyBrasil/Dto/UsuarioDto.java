package com.ProWheyBrasil.Dto;

import jakarta.validation.constraints.*;

public record UsuarioDto(

        @NotNull(message = "O nome do ususario não pode estar vazio")
        @NotBlank(message = "O nome do usuario não pode estar em branco")
        @Size(min = 3, max = 100, message = "O usuario está forma de formataçã")
        String nomeUsuario,

        @NotNull(message = "O email do ususario não pode estar vazio")
        @NotBlank(message = "O email não pode ser estar vazio")
        @Email(message = "O email não esta formatado corretamente")
        String emailUsuario,

        @NotNull(message = "O email do ususario não pode estar vazio")
        @NotBlank(message = "A senha do usuário não pode estar vazia")
        @Size(min = 6, message = "A senha deve ter no minimo 6 caracteres")
        String senhaUsuario,

        @NotNull(message = "O endereço do ususario não pode estar vazio")
        @NotBlank(message = "Endereço do usuario não pode estar em branco")
        String enderecoUsuario,

        @NotNull(message = "O cpf do ususario não pode estar vazio")
        @NotBlank(message = "O cpf não pode ser nullo")
        @Pattern(regexp = "\\d{14}")
        String cpfUsuario,

        @NotNull(message = "O telefone do ususario não pode estar vazio")
        @NotBlank(message = "O telefone não pode estar em branco")
        String telefoneUsuario
) {
}
