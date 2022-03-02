package com.teste.primeiroprojeto.testespringboot.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.teste.primeiroprojeto.testespringboot.model.Produto;

import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository {
    
    private List<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

    /**
     * Metodo para retornar lista de produtos
     * @return Lista de produtos
     */
    public List<Produto> obterTodos(){
        return produtos;
    }

    //Optional não dá excessão, null poiter exception, etc
    /**
     * Metodo que retorna o produto encontrado pelo seu Id
     * @param id do produto a ser localizado
     * @return Retorna, se localizado, o produto referente ao id usado para localização
     */
    public Optional<Produto> obterPorId(Integer id){
        return produtos.stream()
            .filter(produto -> produto
            .getId() == id)
            .findFirst();
    }
}
