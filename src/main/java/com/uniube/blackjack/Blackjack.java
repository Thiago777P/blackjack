/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uniube.blackjack;

import javax.swing.JOptionPane;
/**
 *
 * @author grupo
 */
public class Blackjack {

    public static void main(String[] args) {
        
        Deck baralho = new Deck();
        Player jogador = new Player();
        Dealer dealer = new Dealer();
        
        baralho.embaralhar();
        jogador.adicionarCarta(baralho.distribuir(), 0);
        jogador.adicionarCarta(baralho.distribuir(), 1);
        jogador.adicionarCarta(baralho.distribuir(), 2);
        System.out.println(jogador.mostrarCartas());
        jogador.removerCarta(2);
        System.out.println(jogador.mostrarCartas());
        
        
        
    }
}
