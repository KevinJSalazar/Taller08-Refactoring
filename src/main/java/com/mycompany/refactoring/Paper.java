/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refactoring;

/**
 *
 * @author agome
 */
public class Paper extends Choice{
    @Override
    public void match(Choice choice){
        Paper paper = new Paper();
        if (choice.equals(new Rock()))
            beats = paper;
        else if (choice.equals(new Scissor()))
            loses = paper;
        else if (choice.equals(paper))
            draw++;
    }
}
