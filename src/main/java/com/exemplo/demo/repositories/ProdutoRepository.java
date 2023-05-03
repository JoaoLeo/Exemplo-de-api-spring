package com.exemplo.demo.repositories;

import com.exemplo.demo.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface de repositorio para acessar a entidade no banco
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
