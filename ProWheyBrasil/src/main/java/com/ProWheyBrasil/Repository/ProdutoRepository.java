package com.ProWheyBrasil.Repository;


import com.ProWheyBrasil.Model.PedidoModel;
import com.ProWheyBrasil.Model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/produto")

public interface ProdutoRepository extends JpaRepository<ProdutoModel,Integer>{

  Optional<ProdutoModel> findByNomeProd(String nomeProd);

  Optional<ProdutoModel> findAllByIdProd(Integer idProd);

}

