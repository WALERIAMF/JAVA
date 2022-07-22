/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio01;

import com.mycompany.exercicio01.model.Veiculo;
/**
 *
 * @author waler
 */
public class Teste {

    public static void main(String[] args) {
        

        Veiculo v1 = new Veiculo("BNR3456","Chevrolet","Tracker","Vermelho",230,4,3,133);
        Veiculo v2 = new Veiculo("ABC1234","Honda","HR-V","PRETO",250,4,3,140);
        Veiculo v3 = new Veiculo("GHT8967","Nisan","Kicks","BRANCO",250,4,3,150);
        Veiculo v4 = new Veiculo("HGHJ7890","Renault","Captur","PRATA",240,4,3,150);
        Veiculo v5 = new Veiculo("NJI6789","FIAT","Renegade","AZUL",220,4,4,150);                            
        
        System.out.println(v1);       
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
    }
}
