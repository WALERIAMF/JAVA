package com.teste.primeiroprojeto.testespringboot.domain.request;

public class ProdutoRequest {
    
    public class Produto {
    
        //#region atributos
        private String nome;
        private Integer quantidade;
        private Double valor;
        private String observacoes;
        //#endregion
        
      
        //#region GET SET
      

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public Integer getQuantidade() {
            return quantidade;
        }
        public void setQuantidade(Integer quantidade) {
            this.quantidade = quantidade;
        }
        public Double getValor() {
            return valor;
        }
        public void setValor(Double valor) {
            this.valor = valor;
        }
        public String getObservacoes() {
            return observacoes;
        }
        public void setObservacoes(String observacoes) {
            this.observacoes = observacoes;
        }
        //#endregion
        
      }
    }
      