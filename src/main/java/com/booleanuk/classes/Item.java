package com.booleanuk.classes;

public class Item {
    protected String description;
    protected int weight;

    public String getDescription() {
        return this.description;
    }

    public int getWeight() {
        return this.weight;
    }

    public Item(String description, int weight) {
        this.description = description;
        this.weight = weight;
    }
}
