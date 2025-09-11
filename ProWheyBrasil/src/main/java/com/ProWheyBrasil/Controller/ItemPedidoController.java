package com.ProWheyBrasil.Controller;


import com.ProWheyBrasil.Model.ItemPedidoModel;
import com.ProWheyBrasil.Repository.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/itemPedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    @GetMapping("/idPedido/idProduto")
    public ResponseEntity<Object> getItemPedidoByIdProdutoAndIdPedido(
            @RequestParam("idPedido")Integer idPedido,
            @RequestParam("idProduto") Integer idProduto
    ){
        Optional<List<ItemPedidoModel>> itemsPedidos0 = itemPedidoRepository.findAllByIdPedidoAndIdProduto(idPedido,idProduto);

        if (itemsPedidos0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possivel achar os items do pedido");
        }
        return ResponseEntity.status(HttpStatus.OK).body(itemsPedidos0.get());
    }

}
