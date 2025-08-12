package com.booleanuk.classes;

public class Weapon extends Item{
    public Weapon(String description, int weight) {
        super(description, weight);
    }

    @Override
    public String getDescription() {
        return "A shiny " + this.description;
    }
}
