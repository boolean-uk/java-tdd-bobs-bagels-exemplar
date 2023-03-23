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
        this.contents.add(bagel);
        return true;

    }

    public String toString() {
        return contents.toString();
    }

}
