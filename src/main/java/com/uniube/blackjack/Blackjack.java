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
        
        Deck monte = new Deck();
        Player jogador = new Player();
        Dealer dealer = new Dealer();
        Card carta = new Card("Q","espadas");
        
        monte.embaralhar();
        jogador.adicionarCarta(monte.distribuir());
        jogador.adicionarCarta(monte.distribuir());
        jogador.adicionarCarta(monte.distribuir());
        System.out.println(jogador.mostrarCartas());
        
        System.out.println(carta.getValorCarta(carta)); // baralho[index] <- card
        
    }
}
