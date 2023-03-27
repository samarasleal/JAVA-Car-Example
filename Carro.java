/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

/**
 *
 * @author samara
 */
public class Carro extends Automovel{
    private String portaMala;

    public Carro(String portaMala, Peca[] peca, String nome, String categoria, String estilo) {
        super(peca, nome, categoria, estilo);
        this.portaMala = portaMala;
    }

    public String getPortaMala() {
        return portaMala;
    }

    public void setPortaMala(String portaMala) {
        this.portaMala = portaMala;
    }
    
    
    
    
}
