/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uniube.blackjack;

import java.util.Scanner;

/**
 *
 * @author grupo
 */
public class Blackjack {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Dealer dealer = new Dealer();
        Player jogador = new Player();
        
        System.out.printf("Dinheiro disponivel: %.2f%n", jogador.getDinheiroDisp());
        System.out.print("Valor da aposta>> ");
        double aposta = scanner.nextDouble();
        System.out.println("Teste");
        
        
       
        
    }
}
