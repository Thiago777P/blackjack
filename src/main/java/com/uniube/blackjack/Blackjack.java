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
        
        Dealer dealer = new Dealer();
        Player jogador = new Player();
        
        Card carta = new Card("Q","espadas");
        
        dealer.embaralhar();
        jogador.adicionarCarta(dealer.distribuir());
        jogador.adicionarCarta(dealer.distribuir());
        jogador.adicionarCarta(dealer.distribuir());
        System.out.println(jogador.mostrarCartas());
        
        System.out.println(carta.getValorCarta(carta)); // baralho[index] <- card
        
    }
}
