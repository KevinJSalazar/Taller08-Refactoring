/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refactoring;

/**
 *
 * @author agome
 */
public class Scissor extends Choice{
    @Override
    public void match(Choice choice){
        Scissor scissor = new Scissor();
        if (choice.equals(new Paper()))
            beats = scissor;
        else if (choice.equals(new Rock()))
            loses = scissor;
        else if (choice.equals(scissor))
            draw++;
    }
}
