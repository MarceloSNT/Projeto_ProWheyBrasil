package com.ProWheyBrasil.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record PedidoDto(

        @NotNull(message = "o id do usuario não pode ser em nulo")
        Integer idUsuario,

        @NotNull(message = "o valor do frete é obrigatorio")
        @Min(value = 0)
        Double valorFrete,

        @NotNull(message = " o valor final é obrigatorio")
        @Min(value = 0)
        Double valorFinal
        ) {


}
