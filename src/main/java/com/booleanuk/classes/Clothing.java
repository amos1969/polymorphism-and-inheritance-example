package com.booleanuk.classes;

public class Clothing extends Item {
    private String material;
    public Clothing(String description, int weight) {
        super(description, weight);
        this.material = "Made of cotton.";
    }

    public String getMaterial() {
        return this.material;
    }
}
