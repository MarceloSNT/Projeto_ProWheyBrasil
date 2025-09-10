package com.ProWheyBrasil.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "TBPRODUTOS")
public class ProdutoModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPROD")
    private Integer idProd;
    @Column(name = "NOMEPROD")
    private String nomeProd;
    @Column(name = "MARCAPROD")
    private String marcaProd;
    @Column(name = "OBSERVACOESPROD")
    private String observacoesProd;
    @Column(name = "PESOPROD")
    private Double pesoProd;
    @Column(name = "VALORPROD")
    private Double valorProd;
    @Column(name = "DATAVALIDADE")
    private Date dataValidade;
}
