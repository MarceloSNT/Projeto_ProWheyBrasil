package com.ProWheyBrasil.service;

import com.ProWheyBrasil.model.ProdutoModel;
import com.ProWheyBrasil.model.UsuarioModel;
import com.ProWheyBrasil.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoModel> getAllProdutos(){
    return repository.findAll();
    }

    public Optional<ProdutoModel> getProdutoById(Integer id){
        return repository.findById(id);
    }

    public ProdutoModel postProduto(ProdutoModel produtoModel){
        return repository.save(produtoModel);
    }
}
