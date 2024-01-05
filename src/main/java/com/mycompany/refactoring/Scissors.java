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
public class Scissors extends Choice{
    
    public Scissors() {
        this.name = "scissorss";
        this.beats = new ArrayList<>();
        this.setBeats();
    }

    public void setBeats() {
        this.beats.add(new Scissors());
    }
    
    public void setLoses() {
        this.beats.add(new Rock());
    }
}
