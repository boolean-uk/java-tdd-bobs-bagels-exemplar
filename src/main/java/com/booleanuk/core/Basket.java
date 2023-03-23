package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> contents;
    int capacity;
    public Basket() {
        this.contents = new ArrayList<>();
        this.capacity = 3;
    }

    public boolean add(String bagel) {
        if (this.contents.size() < this.capacity) {
            this.contents.add(bagel);
            System.out.println(bagel + " added to basket.");
            return true;
        } else {
            System.out.println("Could not add " + bagel + " to basket, as it is full.");
            return false;
        }
    }

    public String toString() {
        return contents.toString();
    }

}
