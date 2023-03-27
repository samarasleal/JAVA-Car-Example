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
public class Peca {
    private String nome;
    private String tipo;
    private String fabricacao;

    public Peca(String nome, String tipo, String fabricacao) {
        this.nome = nome;
        this.tipo = tipo;
        this.fabricacao = fabricacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }
    
    
    
}
