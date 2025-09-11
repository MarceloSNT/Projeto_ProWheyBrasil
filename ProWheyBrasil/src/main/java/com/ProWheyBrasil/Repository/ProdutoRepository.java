package com.ProWheyBrasil.Repository;
import com.ProWheyBrasil.Model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel,Integer>{

  Optional<ProdutoModel> findByIdProd(String idProd);

  Optional<ProdutoModel> findAllByIdProd(Integer idProd);

}

