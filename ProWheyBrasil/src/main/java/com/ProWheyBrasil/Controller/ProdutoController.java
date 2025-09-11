package com.ProWheyBrasil.Controller;

import com.ProWheyBrasil.Dto.ProdutoDto;
import com.ProWheyBrasil.Model.PedidoModel;
import com.ProWheyBrasil.Model.ProdutoModel;
import com.ProWheyBrasil.Repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;


    @GetMapping
    public ResponseEntity<List<ProdutoModel>> getAllProdutos() {
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.findAll());

    }

    @PostMapping
    public ResponseEntity<ProdutoModel> postProduto(@RequestBody @Valid ProdutoDto produtoDto) {
        var produto = new ProdutoModel();
        BeanUtils.copyProperties(produtoDto, produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
    }
}
