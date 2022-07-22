/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade_3;

import models.Carga;
import models.Passeio;

/**
 *
 * @author waler
 */
public class Atividade_3 {

    public static void main(String[] args) {
        Passeio passeio = new Passeio();
        Carga carga = new Carga();
 
        
        passeio.setCor("Branco");
        passeio.setMarca("Honda");
        passeio.setModelo("HR-V");
        passeio.setPlaca("ABC1234");
        passeio.setPotencia(140);
        passeio.setQtdPassageiros(5);
        passeio.setQtdPist(3);
        passeio.setQtdeRodas(4);
        passeio.setVelocMax(250);
        passeio.CadastraVeiculoPasseio();
        
        passeio.setCor("Preto");
        passeio.setMarca("Tracker");
        passeio.setModelo("Chevrolet");
        passeio.setPlaca("A3BC1BR");
        passeio.setPotencia(133);
        passeio.setQtdPassageiros(5);
        passeio.setQtdeRodas(4);
        passeio.setQtdPist(3);
        passeio.setVelocMax(230);
        passeio.CadastraVeiculoPasseio();
        
        carga.setCargaMax(650); 
        carga.setCor("Branco");
        carga.setMarca("Fiat");
        carga.setModelo("Fiorino");
        carga.setPlaca("FR345KR");
        carga.setPotencia(84);
        carga.setQtdPist(4);
        carga.setQtdeRodas(4);
        carga.setTara(1118);
        carga.setVelocMax(160);
        carga.CadastraVeiculoCarga();

        
        passeio.setCor("Vermelho");
        passeio.setMarca("Renegade");
        passeio.setModelo("Fiat");
        passeio.setPlaca("TR5G567");
        passeio.setPotencia(150);
        passeio.setQtdPassageiros(5);
        passeio.setQtdeRodas(4);
        passeio.setQtdPist(4);
        passeio.setVelocMax(220);
        passeio.CadastraVeiculoPasseio();
        
        carga.setCargaMax(1593); 
        carga.setCor("Branco");
        carga.setMarca("Renault");
        carga.setModelo("Master Furgão 2.3");
        carga.setPlaca("HRR1234");
        carga.setPotencia(130);
        carga.setQtdPist(4);
        carga.setQtdeRodas(4);
        carga.setTara(1907);
        carga.setVelocMax(145);
        carga.CadastraVeiculoCarga();

        
    }
    
}
