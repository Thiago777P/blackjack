/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniube.blackjack;

import java.util.Arrays;
import java.security.SecureRandom;
/**
 *
 * @author grupo
 */
public class Dealer {

    public static final int NUMERO_DE_CARTAS = 52;
    private final Card[] deck = new Card[NUMERO_DE_CARTAS];
    private int cartaAtual;
    
    public Dealer() {
        int index = 0;
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
        String[] suits = {"espadas", "copas", "paus", "ouros"};
 
        for (String valor : faces) {
            for (String naipe : suits) {
                deck[index++] = new Card(valor, naipe);
            }
        }
        
        
    }
    
    //implementacao O(n) Fisher Yates
    public void embaralhar() {
        cartaAtual = 0;
        SecureRandom random = new SecureRandom();
        int lastIndex = deck.length - 1;
        while (lastIndex > 0) {
            int randomIndex = random.nextInt(lastIndex);
            Card temp = deck[lastIndex];
            deck[lastIndex] = deck[randomIndex];
            deck[randomIndex] = temp;
            lastIndex--;
        }
    }
    
    //distribui uma carta
    public Card distribuir() {
        if (cartaAtual >= deck.length) {
            System.out.println("Fim do monte."); return null;
        }
        return deck[cartaAtual++];
    }
    
    @Override
    public String toString() {
        return Arrays.toString(deck);
    }

}