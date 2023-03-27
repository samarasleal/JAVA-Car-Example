/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;
import java.util.Scanner;
/**
 *
 * @author samara
 */
public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Peca []peca = new Peca[5];
        String nome, tipo, fabricacao;
        for(int i=0; i<5;i++){
            System.out.println("Informe o nome da peça "+i);
            nome = entrada.next();
            System.out.println("Informe o tipo da peça "+i);
            tipo = entrada.next();
            System.out.println("Informe a fabricao peça "+i);
            fabricacao = entrada.next();
            Peca p1 = new Peca(nome, tipo, fabricacao);
            peca[i]= p1;
        }
        System.out.println("Informe o porta mala da peça ");
        String portaMala = entrada.next();
        System.out.println("Informe o nome do carro ");
        String nomeCarro = entrada.next();
        System.out.println("Informe a categora do carro");
        String categoria = entrada.next();
        System.out.println("Informe o estilo do carro");
        String estilo = entrada.next();
        Carro gol = new Carro(portaMala, peca, nomeCarro, categoria, estilo);
        System.out.println("Nome do carro"+gol.getNome());
        Peca[] pecaRetorno = gol.getPeca();
        for(int i=0; i<5;i++){
            System.out.println("Peça"+i);
            System.out.println(pecaRetorno[i].getNome());
            System.out.println(pecaRetorno[i].getFabricacao());
            System.out.println(pecaRetorno[i].getTipo());
        }
    }   
}
