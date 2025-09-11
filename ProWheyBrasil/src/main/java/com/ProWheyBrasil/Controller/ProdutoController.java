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
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public ResponseEntity<ProdutoModel> postProduto(@RequestBody @Valid ProdutoDto produtoDto) {
        var produto = new ProdutoModel();
        BeanUtils.copyProperties(produtoDto, produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> getAllProdutos() {
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.findAll());
    }

    @GetMapping("/idProd")
    public ResponseEntity<Object> getById(@PathVariable(value = "idProd") Integer idProd){
        Optional<ProdutoModel> produto0 = produtoRepository.findById(idProd);
        if (produto0.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(produto0.get());
    }

}
