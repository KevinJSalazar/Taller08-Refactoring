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
public class Player {
    private int wins;
    private Choice choice;
    
    public void setChoice(){
       ArrayList<Choice> choices = this.getChoices();
       int c = (int)(Math.random()*(choices.size()));
       this.choice = choices.get(c-1);
    }
    
    public ArrayList<Choice> getChoices(){
        ArrayList<Choice> choices = new ArrayList<>();
        choices.add(new Rock());
        choices.add(new Paper());
        choices.add(new Scissors());
        return choices;
    }
    
    public Player match(Player player, Lanzamiento lanzamiento){
        if (this.choice.isDraw(player.choice))
            lanzamiento.setState("draw");
        else{
            if (player.choice.equals(this.choice.getBeats())){
                this.wins++;
                return this;
            }
            if (player.choice.equals(this.choice.getLoses())){
                player.wins++;
                return player;
            }
            lanzamiento.setState("win");
        }
        return null;
    }
    
    public Choice getChoice(){
        return choice;
    }
    
    public void setWins(int wins){
        this.wins = wins;
    }
    
    public int getWins(){
        return wins;
    }
}
