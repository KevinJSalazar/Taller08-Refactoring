/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refactoring;

/**
 *
 * @author agome
 */
public class Player {
    protected int wins;
    Choice choice;
    
    public void setChoice(){
       int c = (int)(Math.random()*3);
       switch(c) {
           case 0:
               choice = new Rock();
               break;
           case 1:
               choice = new Paper();
               break;
           case 2:
               choice = new Scissor();
               break;
       }
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
