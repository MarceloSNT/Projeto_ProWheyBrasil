package com.ProWheyBrasil.Controller;


import com.ProWheyBrasil.Dto.ItemPedidoDto;
import com.ProWheyBrasil.Model.ItemPedidoModel;
import com.ProWheyBrasil.Repository.ItemPedidoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/ItemPedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    @PostMapping
    public ResponseEntity<ItemPedidoModel> save(@RequestBody @Valid ItemPedidoDto itemPedidoDto) {
        var itemPedido = new ItemPedidoModel();
        BeanUtils.copyProperties(itemPedidoDto, itemPedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                itemPedidoRepository.save(itemPedido));
    }

    @GetMapping
    public ResponseEntity<List<ItemPedidoModel>> getAllItensPedidos(){
        return ResponseEntity.status(HttpStatus.OK).body(itemPedidoRepository.findAll());
    }

    @GetMapping("/idPedido/idProduto")
    public ResponseEntity<Optional<ItemPedidoModel>> getByIdPedidoAndIdProduto
            (@PathVariable("idPedido")Integer idPedido,
             @PathVariable("idProduto") Integer idProduto){
        return ResponseEntity.status(HttpStatus.OK).body(itemPedidoRepository
                .findByIdProdutoAndIdPedido(idProduto,idPedido));

    }
}
