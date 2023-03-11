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
public class Deck {

    public static final int NUMERO_DE_CARTAS = 52;
    private final Card[] deck = new Card[NUMERO_DE_CARTAS];
    SecureRandom random = new SecureRandom();
    
    public Deck() {
        int index = 0;
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
        String[] naipes = {"espadas", "copas", "paus", "ouros"};
 
        for (String valor : faces) {
            for (String naipe : naipes) {
                deck[index++] = new Card(valor, naipe);
            }
        }
    }
    
    public void embaralhar() {
        Card temp;
        for (int i = 0; i < deck.length; i++) {
            Card randomPosDeck = deck[random.nextInt(52)];
            temp = deck[i];
            deck[i] = randomPosDeck;
            randomPosDeck = temp;
        }
    }
    
    @Override
    public String toString() {
        return Arrays.toString(deck);
    }

}