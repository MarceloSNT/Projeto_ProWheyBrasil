package com.ProWheyBrasil.Dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record ProdutoDto(

        @NotBlank(message = "Este campo não pode estar em branco")
        @NotNull(message = "o nome do produto não pode estar vazio") String nomeProd,

        @NotBlank(message = "Este campo não pode estar em branco")
        @NotNull(message = "o nome da marca não pode estar vazio") String marcaProd,

        @NotBlank(message = "Este campo não pode estar em branco")
        @NotNull(message = "as observações não podem ser nulo") String observacoesProd,


        @NotNull(message = "o id do usuario não pode ser em nulo") @Min(value = 0) Double pesoProd,

        @NotNull(message = "o id do usuario não pode ser em nulo") @Min(value = 0) Double valorProd,

        @NotNull(message = "não é possivel selecionar um data já passada ") @Future Date dataValidade) {


}

