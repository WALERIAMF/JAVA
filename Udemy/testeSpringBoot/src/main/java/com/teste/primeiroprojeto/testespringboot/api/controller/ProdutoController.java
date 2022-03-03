package com.teste.primeiroprojeto.testespringboot.api.controller;

import java.util.List;
import java.util.Optional;

import com.teste.primeiroprojeto.testespringboot.domain.model.Produto;
import com.teste.primeiroprojeto.testespringboot.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")

public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> obterTodospProdutos(){
        return produtoService.obterTodoProdutos();
    }
    
    @GetMapping("/{id}")
    public Optional<Produto> obterProdutosPorId(@PathVariable Integer id){
        return produtoService.obterPorIdProdutos(id);
    }
    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto){
        return produtoService.adicionaProduto(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable Integer id, @RequestBody Produto produto){
        return produtoService.atualizarProduto(id, produto);
    }
    
    @DeleteMapping("/{id}")
    public String deletarProduto(@PathVariable Integer id){
        produtoService.deletarProduto(id);
        return "Produto com id: " + id + " foi deletado com sucesso";
    }

}