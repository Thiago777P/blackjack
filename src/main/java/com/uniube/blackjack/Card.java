/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniube.blackjack;

/**
 *
 * @author User
 */
public class Card {
    
    private String face;
    private String naipe;

    public Card(String face, String naipe) {
        this.face = face;
        this.naipe = naipe;
    }

    //sobrescrever o método toString() [nativo] para mostrar a carta
    @Override 
    public String toString() {
        return face + " de " + naipe;
    }

}
