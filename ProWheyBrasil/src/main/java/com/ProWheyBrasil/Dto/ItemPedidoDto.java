package com.ProWheyBrasil.Dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record ItemPedidoDto(
        @NotNull(message = "O id do pedido não pode estar vazio")
        @Min(value = 0,message = "O id tem que ser menor que zero")
        Integer idPedido,

        @Min(value = 1, message = "O valor do id não pode ser menor que 0")
        @NotNull(message = "O id do produto não pode estar vazio")
        Integer idProduto,

        @Min(value = 0, message = "A quantidade não pode ser menor que zero")
        @NotNull(message = "A quantidade de itens pedidos não pode ser vazia")
        Double quantidade,

        @NotNull(message = "O valor do pedido não pode estar vazio")
        @Min(value = 0,message = "O valor do pedido não pode ser menor que zero")
        Double valorPedido

) {
}
