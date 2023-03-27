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
public class Automovel {
    private Peca []peca;
    private String nome;
    private String categoria;
    private String estilo;

    public Automovel(Peca[] peca, String nome, String categoria, String estilo) {
        this.peca = peca;
        this.nome = nome;
        this.categoria = categoria;
        this.estilo = estilo;
    }

    public Peca[] getPeca() {
        return peca;
    }

    public void setPeca(Peca[] peca) {
        this.peca = peca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
    
    
}
