/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uniube.blackjack;

import java.util.Scanner;

/**
 *
 * @author grupo
 */
public class Blackjack {

    public static void main(String[] args) {
        
        //preparativos
        Scanner scanner = new Scanner(System.in);
        Dealer dealer = new Dealer();
        Player jogador = new Player();
        dealer.embaralhar();
        
        //2 cartas pro jogador
        jogador.adicionarCarta(dealer.distribuir());
        jogador.adicionarCarta(dealer.distribuir());
        
        //2 cartas pro dealer
        
        
        
        
        //jogo
        System.out.println("-= BEM-VINDO AO 21 -=");
        System.out.printf("Dinheiro na banca: %.2f%n", jogador.getDinheiroDisp());
        System.out.print("Valor da aposta>> ");
        double aposta = scanner.nextDouble();
        System.out.println();
        System.out.println();
        
        
        
        
                
    }
}
