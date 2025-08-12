package com.booleanuk.classes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Item sword = new Weapon("Sword", 1000);
        Item axe = new Weapon("Axe", 1000);
        Item hat = new Clothing("Hat", 100);

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

