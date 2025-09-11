package com.ProWheyBrasil.Repository;

import com.ProWheyBrasil.Model.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModel,Integer> {
    Optional<PedidoModel> findByIdPedido(Integer idPedido);
    Optional<PedidoModel> findAllByidPedido(Integer idPedido);
}
