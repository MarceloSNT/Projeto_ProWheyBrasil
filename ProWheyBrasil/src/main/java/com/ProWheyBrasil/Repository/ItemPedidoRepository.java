package com.ProWheyBrasil.Repository;

import com.ProWheyBrasil.Model.ItemPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedidoModel,Integer> {

    @Query(value = "select * from TBITEMPEDIDOS WHERE idProduto =?1 AND idPedido= ?2")
    Optional<ItemPedidoModel> findByIdProdutoAndIdPedido(Integer idProduto, Integer idPedido);

}
