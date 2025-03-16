package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PizzaMaster pizzaMaster = new PizzaMaster(new HawaiianPizzaBuilder());
        Pizza hawaiianPizza = pizzaMaster.constructPizza("medium", "thin", Arrays.asList("ham", "pineapple"));
        System.out.println(hawaiianPizza);

        pizzaMaster = new PizzaMaster(new VegetarianPizzaBuilder());
        Pizza vegetarianPizza = pizzaMaster.constructPizza("large", "thick", Arrays.asList("tomato", "onion", "pepper"));
        System.out.println(vegetarianPizza);
    }
}