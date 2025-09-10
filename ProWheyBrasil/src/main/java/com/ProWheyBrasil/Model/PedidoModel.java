package com.ProWheyBrasil.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "TBPEDIDOS")
public class PedidoModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPEDIDO")
    private Integer idPedido;
    @Column(name = "IDUSUARIO")
    private Integer idUsuario;
    @Column(name = "VALORFRETE")
    private Double valorFrete;
    @Column(name = "VALORFINAL")
    private Double valorFinal;
}
