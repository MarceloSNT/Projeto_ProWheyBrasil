package com.ProWheyBrasil.controller;

import com.ProWheyBrasil.dto.ProdutoDto;
import com.ProWheyBrasil.model.ProdutoModel;
import com.ProWheyBrasil.repository.ProdutoRepository;
import com.ProWheyBrasil.service.ProdutoService;
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
@RequestMapping("api/v1/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public ResponseEntity<ProdutoModel> postProduto(@RequestBody @Valid ProdutoDto produtoDto) {
        var produto = new ProdutoModel();
        BeanUtils.copyProperties(produtoDto, produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.postProduto(produto));
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> getAllProdutos() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllProdutos());
    }

    @GetMapping("/idProd")
    public ResponseEntity<Object> getById(@PathVariable(value = "idProd") Integer idProd){
        Optional<ProdutoModel> produto0 = service.getProdutoById(idProd);
        if (produto0.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(produto0.get());
    }

}
