package com.ProWheyBrasil.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "TBITEMPEDIDOS")
public class ItemPedidoModel {
    @Column(name = "IDPEDIDO")
    private Integer idPedido;
    @Column(name = "IDPRODUTO")
    private Integer idProduto;
    @Column(name = "QUANTIDADE")
    private Double quantidade;
    @Column(name = "VALORPEDIDO")
    private Double valorPedido;

}
