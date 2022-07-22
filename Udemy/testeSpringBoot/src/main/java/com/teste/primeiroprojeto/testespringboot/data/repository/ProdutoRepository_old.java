// package com.teste.primeiroprojeto.testespringboot.data.repository;

// import java.util.ArrayList;
// import java.util.InputMismatchException;
// import java.util.List;
// import java.util.Optional;

// import com.teste.primeiroprojeto.testespringboot.domain.exception.ResourceNotFoundException;
// import com.teste.primeiroprojeto.testespringboot.domain.model.Produto;

// import org.springframework.stereotype.Repository;

// @Repository
// public class ProdutoRepository_old {
    

//     //#region simulando banco de dados
//     private List<Produto> produtos = new ArrayList<Produto>();
//     private Integer ultimoId = 0;
//     //#endregion

    
//     /**
//      * Metodo para retornar lista de produtos
//      * @return Lista de produtos
//      */
//     public List<Produto> obterTodosProdutos(){
//         return produtos;
//     }

//     //Optional não dá excessão, null poiter exception, etc
//     /**
//      * Metodo que retorna o produto encontrado pelo seu Id
//      * @param id do produto a ser localizado
//      * @return Retorna, se localizado, o produto referente ao id usado para localização
//      */
//     public Optional<Produto> obterPorIdProdutos(Integer id){
//         return produtos.stream()
//             .filter(produto -> produto
//             .getId() == id)
//             .findFirst();
//     }

//     /**
//      * Metodo para adicionar produto na lista
//      * @param produto que será adicionado
//      * @return Retorna o produto a ser adicionado na lista
//      */
//     public Produto adicionaProduto(Produto produto){
//         ultimoId++;

//         produto.setId(ultimoId);
//         produtos.add(produto);

//         return produto;
//     }

//     /**
//      * Metodo para atualizar o produto na lista
//      * @param produto que será atualizado
//      * @return Retorna o produto após atualizar a lista
//      */
//     public Produto atualizarProduto(Produto produto){
//         //Encontrar produto na lista
//         Optional<Produto> produtoEncontrado =  obterPorIdProdutos(produto.getId());

//         if(produtoEncontrado.isEmpty()){
//             throw new ResourceNotFoundException("Produto não pode ser atualizado, pois não existe");
//         }
//         //Remover produto antigo da lista
//         deletarProduto(produto.getId());

//         //Depois adicionar o produto atulizado na lista
//         produtos.add(produto);
//         return produto;
//     }

//     /**
//      * Metodo que remove produto da lista 
//      * @param id do produto que será removido
//      */
//     public void deletarProduto(Integer id){
//         produtos.removeIf(produto -> produto.getId() == id);
//     }
// }
