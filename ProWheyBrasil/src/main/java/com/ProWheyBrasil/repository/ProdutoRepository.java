package com.ProWheyBrasil.repository;
import com.ProWheyBrasil.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel,Integer>{

  Optional<ProdutoModel> findByIdProd(Integer idProd);

  Optional<ProdutoModel> findAllByIdProd(Integer idProd);

}

