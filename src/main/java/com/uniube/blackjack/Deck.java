/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniube.blackjack;

import java.util.Arrays;
import java.security.SecureRandom;
import java.util.Collections;
/**
 *
 * @author grupo
 */
public class Deck {

    public static final int NUMERO_DE_CARTAS = 52;
    private final Card[] deck = new Card[NUMERO_DE_CARTAS];
    
    
    public Deck() {
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
    
    @Override
    public String toString() {
        return Arrays.toString(deck);
    }

}