package com.ProWheyBrasil.Repository;

import com.ProWheyBrasil.Model.ItemPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ItemPedidoRepository extends JpaRepository<ItemPedidoModel,Integer> {

    @Query(value = "select * from TBITENSPEDIDOS WHERE idProduto =?1 AND idPedido= ?2")
    Optional<ItemPedidoModel> findAllByIdProdutoAndIdPedido(Integer idProduto, Integer idPedido);

}
