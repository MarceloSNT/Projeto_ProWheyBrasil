package com.ProWheyBrasil.Dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record ItemPedidoDto(
        @NotNull(message = "O id do produto não pode ser nulo")
        Integer idProduto,
        @NotNull(message = "O id do pedido não pode ser nulo")
        Integer idPedido,
        @Min(value = 0, message = "A quantidade minima permitida é 0")
        Integer quantidade,
        @NotNull(message = "O valor do pedido não pode ser null")
        @Min(value = 0, message = "O valor do pedido não pode ser menor que 0")
        Double valorPedido

) {
}
