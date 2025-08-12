package com.booleanuk.interfaces;

public class Weapon implements Item{
    private String description;
    private int weight;

    public String getDescription() {
        return this.description;
    }

    public int getWeight() {
        return this.weight;
    }

    public Weapon(String description, int weight) {
        this.description = description;
        this.weight = weight;
    }
}
