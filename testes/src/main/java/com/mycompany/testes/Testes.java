/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author waler
 */
public class Testes {
  public static void main(String[] args) {
 Pessoa camilo = new Pessoa("Camilo", 123);
        Funcionario rafael = new Funcionario("Rafael", 111, "informatica");
        
        /* Todo Funcionario é uma Pessoa. */
        Pessoa sakurai = new Funcionario("Sakurai", 222, "telecomunicação");
        

        System.out.println(sakurai);
    }
}