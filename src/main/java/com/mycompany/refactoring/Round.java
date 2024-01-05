/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refactoring;

import java.util.ArrayList;

/**
 *
 * @author agome
 */
public class Round {
    private Player winnerRound;
    private ArrayList<Lanzamiento> lanzamientos;

    public Round() {
        this.lanzamientos = new ArrayList<>();
    }
    
    public void newLanzamiento(Player player1, Player player2){
        lanzamientos.add(new Lanzamiento(player1, player2));
    }
    
    public void setWinnerRound(Player winner){
        this.winnerRound = winner;
    }
}
