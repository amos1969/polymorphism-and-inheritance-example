package com.booleanuk.interfaces;

public class Clothing implements Item{
    private String description;
    private int weight;

    public String getDescription() {
        return this.description;
    }

    public int getWeight() {
        return this.weight;
    }

    public Clothing(String description, int weight) {
        this.description = description;
        this.weight = weight;
    }
}
