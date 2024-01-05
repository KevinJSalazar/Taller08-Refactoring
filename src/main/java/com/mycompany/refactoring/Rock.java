/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refactoring;

/**
 *
 * @author agome
 */
public class Rock extends Choice{
    
    @Override
    public void match(Choice choice){
        Rock rock = new Rock();
        if (choice.equals(new Paper()))
            loses = rock;
        else if (choice.equals(new Scissor()))
            beats = rock;
        else if (choice.equals(rock))
            draw++;
    }
    
    
}
