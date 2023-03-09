/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniube.blackjack;

/**
 *
 * @author User
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
        
        for (int i = 0; i < faces.length; i++) {
            for (int j = 0; j < naipes.length; j++) {
                deck[indexAtualDoBaralho++] = new Card(faces[i], naipes[j]);
            }
        }

    }
    
    public void getDeck() {
        for (Card i : deck) {
            System.out.println(i);
        }
    }

}