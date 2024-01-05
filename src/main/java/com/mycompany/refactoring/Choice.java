/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refactoring;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author agome
 */
public abstract class Choice {
    protected String name;
    protected ArrayList<Choice> beats;
    protected ArrayList<Choice> loses;
    
    public abstract void setBeats();
    public abstract void setLoses();
    
    public boolean isDraw(Choice choice){
        if (choice.equals(this))
            return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Choice> getBeats() {
        return beats;
    }
    
    public ArrayList<Choice> getLoses() {
        return loses;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Choice other = (Choice) obj;
        return Objects.equals(this.name, other.name);
    }
    
    
}