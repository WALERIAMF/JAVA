/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testes;

/**
 *
 * @author waler
 */
public class Coordenador extends Pessoa {
private String nome;
    private int matricula;
    private String cursoCoordenado;
    
    public Coordenador(String nome, int matricula, String cursoCoordenado) {
        this.nome = nome;
        this.matricula = matricula;
        this.cursoCoordenado = cursoCoordenado;
    }

@Override
    public int getMatricula() { return matricula; }
@Override
    public void setMatricula(int matricula) { this.matricula = matricula; }

@Override
    public String getNome() { return nome; }
@Override
    public void setNome(String nome) { this.nome = nome; }

    public String getCursoCoordenado() { return cursoCoordenado; }
    public void setCursoCoordenado(String cursoCoordenado) {
        this.cursoCoordenado = cursoCoordenado;
    }
}