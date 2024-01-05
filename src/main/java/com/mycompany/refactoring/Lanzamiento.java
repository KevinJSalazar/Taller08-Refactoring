/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refactoring;

/**
 *
 * @author agome
 */
public class Lanzamiento {
    private String state;
    private Player player1;
    private Player player2;

    public Lanzamiento(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void lanzar(Round round){
        player1.getWins();
        player2.getWins();
        player1.setChoice();
        player2.setChoice();
        if (player1.match(player2, this) != null)
            round.setWinnerRound(player1.match(player2, this));
    }

    public void setState(String state) {
        this.state = state;
    }
}
