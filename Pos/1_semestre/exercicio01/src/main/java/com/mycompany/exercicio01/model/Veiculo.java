/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio01.model;

/**
 *
 * @author waler
 */
public class Veiculo extends Motor{
    
    private String placa, marca, modelo, cor; 
    private float velocMax;
    private int qtdRodas;

    public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist, int potencia) {
        super(qtdPist, potencia);
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;      
    }

    @Override
    public String toString(){
       return "Modelo: " + this.modelo + ", " + "Marca: " + this.marca + 
               ", " +"Cor: " + this.cor+ ", " + "Placa: " + this.placa + 
               ", " + "Rodas: " + this.qtdRodas + ", " + "Velocidade Máxima: " + this.velocMax + 
               ", " +  "Potência: " + super.getPotencia() + ", " + "Quantidade de Pistões: "  + super.getQtdPist();
       
    }
}
