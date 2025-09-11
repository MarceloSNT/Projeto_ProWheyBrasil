package com.ProWheyBrasil.Repository;

import com.ProWheyBrasil.Model.ItemPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ItemPedidoRepository extends JpaRepository<ItemPedidoModel,Integer> {

    Optional<List<ItemPedidoModel>> findAllByIdPedidoAndIdProduto(Integer idPedido,Integer idProduto);

}
