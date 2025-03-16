package org.example;

import java.util.List;

public class PizzaMaster {
    private PizzaBuilder pizzaBuilder;

    public PizzaMaster(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza constructPizza(String size, String dough, List<String> toppings) {
        pizzaBuilder.setSize(size);
        pizzaBuilder.setDough(dough);
        pizzaBuilder.setToppings(toppings);
        return pizzaBuilder.build();
    }
}