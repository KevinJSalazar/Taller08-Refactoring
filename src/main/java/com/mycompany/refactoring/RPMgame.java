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
public class RPMgame implements Game{
    private Player winnerGame;
    private ArrayList<Round> rounds;

    public RPMgame() {
        this.rounds = new ArrayList<>();
    }
    
    public void newRound(){
        rounds.add(new Round());
    }

    public void setWinnerGame(Player winnerGame) {
        this.winnerGame = winnerGame;
    }
    
    @Override
    public void play(){
        //cuerpo del juego
    }
}
