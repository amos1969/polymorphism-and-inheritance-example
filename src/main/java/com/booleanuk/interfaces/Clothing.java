package com.booleanuk.interfaces;

public class Clothing implements Item{
    private String description;
    private int weight;
    private String material;

    public String getDescription() {
        return this.description;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getMaterial() {
        return this.material;
    }

    public Clothing(String description, int weight) {
        this.description = description;
        this.weight = weight;
        this.material = "Made of wool";
    }
}
