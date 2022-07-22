package com.teste.primeiroprojeto.testespringboot.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.teste.primeiroprojeto.testespringboot.data.repository.ProdutoRepository;
import com.teste.primeiroprojeto.testespringboot.domain.dto.ProdutoDto;
import com.teste.primeiroprojeto.testespringboot.domain.model.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    //fornece controle sobre onde e como a ligação entre os beans deve ser realizada. 
    //Pode ser usado para em métodos setter, no construtor, em uma propriedade ou métodos com nomes arbitrários e / ou vários argumentos.
    @Autowired
    private ProdutoRepository produtoRepository;

        /**
     * Metodo para retornar lista de produtos
     * @return Lista de produtos
     */
    public List<ProdutoDto> obterTodoProdutos()
    {
        List<Produto> produtos = produtoRepository.findAll(); 
        return produtos.stream()
        .map(produto -> new ModelMapper()
        .map(produto, ProdutoDto.class))
        .collect(Collectors.toList());   
    }

      /**
     * Metodo que retorna o produto encontrado pelo seu Id
     * @param id do produto a ser localizado
     * @return Retorna, se localizado, o produto referente ao id usado para localização
     */
    public Optional<Produto> obterPorIdProdutos(Integer id)
    {
        return produtoRepository.findById(id);
    }

     /**
     * Metodo para adicionar produto na lista
     * @param produto que será adicionado
     * @return Retorna o produto a ser adicionado na lista
     */
    public ProdutoDto adicionaProduto(ProdutoDto produto){

        return produtoRepository.adicionaProduto(produto);
    }


     /**
      * Metodo para atualizar o produto na lista
      * @param id do produto a ser atualizado
      * @param produto
      * @return Retorna o produto após atualizar a lista
      */
    public Produto atualizarProduto(Integer id, Produto produto){
        produto.setId(id);
        return produtoRepository.atualizarProduto(produto);
    }

    /**
     * Metodo que remove produto da lista 
     * @param id do produto que será removido
     */
    public void deletarProduto(Integer id){

        produtoRepository.deleteById(id);

    }
}

