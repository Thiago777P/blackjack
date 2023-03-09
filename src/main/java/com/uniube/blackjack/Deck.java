/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniube.blackjack;

import java.util.Arrays;

/**
 *
 * @author grupo
 */
public class Deck {

    public static final int NUMERO_DE_CARTAS = 52;
    private Card[] deck;

    //criar um baralho
    public Deck() {
        
        deck = new Card[NUMERO_DE_CARTAS];
        int indexAtualDoBaralho = 0;
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
        String[] naipes = {"espadas", "copas", "paus", "ouros"};
       
        for (String valor : faces) {
            for (String naipe : naipes ) {
                deck[indexAtualDoBaralho++] = new Card(valor, naipe);
            }
        }
        
    }
    
    @Override
    public String toString() {
        return Arrays.toString(deck);
    }

}