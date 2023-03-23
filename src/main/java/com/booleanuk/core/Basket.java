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

    public boolean remove(String bagel) {
        if (this.contents.remove(bagel)) {
            System.out.println("Successfully removed a " + bagel + " from basket.");
            return true;
        } else {
            System.out.println("Could not remove a " + bagel + " from the basket as there doesn't appear to be one stored in there.");
            return false;
        }
    }

    public boolean resizeBasket(int newCapacity) {
        if (newCapacity > 0) {
            this.capacity = newCapacity;
            while (this.contents.size() > this.capacity) {
                this.contents.remove(this.contents.size()-1);
            }
            System.out.println("Basket resized to hold " + this.capacity + " bagels.");
            return true;
        } else {
            System.out.println("Could not resize basket, please supply a positive, whole number for the new capacity.");
            return false;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return contents.toString();
    }

}
