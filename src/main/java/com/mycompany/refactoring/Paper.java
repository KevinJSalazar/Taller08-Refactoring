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
public class Paper extends Choice{

    public Paper() {
        this.name = "paper";
        this.beats = new ArrayList<>();
        this.setBeats();
    }

    public void setBeats() {
        this.beats.add(new Rock());
    }
    
    public void setLoses() {
        this.beats.add(new Scissors());
    }
}
