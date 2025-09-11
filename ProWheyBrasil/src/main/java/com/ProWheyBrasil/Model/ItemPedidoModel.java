package com.ProWheyBrasil.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TBITEMPEDIDO")
public class ItemPedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDITEMPEDIDO")
    private Integer idItemPedido;
    @Column(name = "IDPRODUTO")
    private Integer idProduto;
    @Column(name = "IDPEDIDO")
    private Integer idPedido;
    @Column(name = "QUANTIDADE")
    private Integer quantidade;
    @Column(name = "VALORPEDIDO")
    private Double valorPedido;


}
