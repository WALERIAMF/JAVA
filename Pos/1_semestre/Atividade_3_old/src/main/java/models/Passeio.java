
package models;

/**
 *
 * @author waler
 */
public class Passeio extends Veiculo{
    int qtdPassageiros = 0;

    public Passeio() {
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }   
    
    public void CadastraVeiculoPasseio(){
        System.out.println("\n*** VEICULO PASSEIO ***");
        System.out.println("Placa: " + super.getPlaca());
        System.out.println("Marca: " + super.getMarca());
        System.out.println("Modelo: " + super.getModelo());
        System.out.println("Cor: " + super.getCor());
        System.out.println("Quantidade de Passageiros: " + this.qtdPassageiros);
        System.out.println("Rodas: " + super.getQtdeRodas());
        System.out.println("Potencia: " + super.getPotencia() + "CV");
        System.out.println("Quantidade de Pistões: " + super.getQtdPist());
        System.out.println("Velocidade Máxima: " + (int) super.getVelocMax() + "km/h");
        System.out.println("Velocidade em Metros: " + (int) VelMaximaMetros(super.getVelocMax())+ "m/h");
       
    }
}
