package com.teste.primeiroprojeto.testespringboot.data.repository;

import com.teste.primeiroprojeto.testespringboot.domain.model.Produto;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}
