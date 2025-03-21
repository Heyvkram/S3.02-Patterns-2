package org.example;

import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private List<String> toppings;

    public Pizza(String size, String dough, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Your pizza! " + size + " size, " + dough + " dough, " + "with delicious " + String.join(", ", toppings) + " toppings!";
    }
}
