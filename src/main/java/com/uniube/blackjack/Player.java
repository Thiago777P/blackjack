/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniube.blackjack;

import java.util.Arrays;

/**
 *
 * @author group
 */
public class Player {
   
    private double dinheiroDisp = 100;
    private Card[] mao = new Card[3];
    
    public void adicionarCarta(Card carta, int index) {
        if (index > 2) {
            System.out.println("Index inválido."); return;
        }
        mao[index] = carta;
    }
    
    public void removerCarta(int index) {
        mao[index] = null;
    }
    
    public String mostrarCartas() {
        return Arrays.toString(mao);
    }
    
    public double getDinheiroDisp(){
        return dinheiroDisp;
    }
    
    
}
    
