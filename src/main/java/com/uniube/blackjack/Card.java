/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniube.blackjack;

/**
 *
 * @author grupo
 */
public class Card {
    
    private final String face; 
    private final String naipe;

    public Card(String face, String naipe) {
        this.face = face;
        this.naipe = naipe;
    }
    
    public String getFace() {
        return this.face;
    }
    
    public int getValorCarta(Card carta){
        String faceCarta = carta.getFace();
        int valorCarta;
        valorCarta = switch (faceCarta) {
            case "Q", "J", "K" -> 10;
            default -> Integer.parseInt(faceCarta);
        };
        return valorCarta;
    }
    

    @Override 
    public String toString() {
        return face + " de " + naipe;
    }

}
