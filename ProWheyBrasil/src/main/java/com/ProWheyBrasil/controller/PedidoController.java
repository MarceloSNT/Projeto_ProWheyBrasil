package com.ProWheyBrasil.controller;


import com.ProWheyBrasil.dto.PedidoDto;
import com.ProWheyBrasil.model.PedidoModel;
import com.ProWheyBrasil.repository.PedidoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public ResponseEntity<List<PedidoModel>> getAllPedidos(){
        return ResponseEntity.status(HttpStatus.OK).body(pedidoRepository.findAll());
    }

    @PostMapping
public ResponseEntity<PedidoModel> postPedido(@RequestBody @Valid PedidoDto pedidoDto){
        var pedido = new PedidoModel();
        BeanUtils.copyProperties(pedidoDto, pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoRepository.save(pedido));
    }

}
