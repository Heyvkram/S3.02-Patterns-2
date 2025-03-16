package org.example;

import java.util.Arrays;
import java.util.List;

public class VegetarianPizzaBuilder implements PizzaBuilder {
    private String size;
    private String dough;
    private List<String> toppings;

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void setDough(String dough) {
        this.dough = dough;
    }

    @Override
    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public Pizza build() {
        return new Pizza(size, dough, Arrays.asList("tomato", "onion", "pepper"));
    }
}
