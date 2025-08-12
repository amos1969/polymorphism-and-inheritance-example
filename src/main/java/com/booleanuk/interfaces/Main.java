package com.booleanuk.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item sword = new Weapon("A sword", 1000);
        Item axe = new Weapon("An axe", 1000);
        Item hat = new Clothing("A hat", 100);

        List<Item> inventory = new ArrayList<>();
        inventory.add(sword);
        inventory.add(axe);
        inventory.add(hat);

        System.out.println("Inventory");
        System.out.println("=========");
        for (Item thing : inventory) {
            if (thing instanceof Clothing) {
                System.out.println(thing.getDescription() + " - " + ((Clothing) thing).getMaterial());
            } else {
                System.out.println(thing.getDescription());
            }
        }
    }
}
