/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author waler
 */
public class Carga extends Veiculo{
    int cargaMax = 0, tara = 0;

    public Carga() {
    }


    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }
    
    public void CadastraVeiculoCarga(){
        System.out.println("\n*** VEICULO CARGA ***");
        System.out.println("Placa: " + super.getPlaca());
        System.out.println("Marca: " + super.getMarca());
        System.out.println("Modelo: " + super.getModelo());
        System.out.println("Cor: " + super.getCor());
        System.out.println("Rodas: " + super.getQtdeRodas());
        System.out.println("Velocidade Máxima: " + (int) super.getVelocMax() + "Km/h");
        System.out.println("Velocidade em Metros: " + (int) VelMaximaMetros(super.getVelocMax())+ "m/h");
        System.out.println("Carga Máxima: " + this.cargaMax  + " quilos");
        System.out.println("Tara: " + this.tara + " quilos");
        
    }
}
