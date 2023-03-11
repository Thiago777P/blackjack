/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniube.blackjack;

import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author group
 */
public class Player {
   
    private double dinheiroDisp = 100;
    //private Card[] mao = new Card[3];
    ArrayList<Card> mao = new ArrayList<>();
    
    public void adicionarCarta(Card carta, int index) {
        if (index > 2) {
            System.out.println("Index inválido."); return;
        }
        mao.add(carta);
    }
    
    public void removerCarta(Card carta) {
        mao.remove(carta);
    }
    
    public void limparMao() {
        mao.clear();
    }
    
    public String mostrarCartas() {
        return mao.toString();
    }
    
    public double getDinheiroDisp(){
        return dinheiroDisp;
    }
    
    
}
    
