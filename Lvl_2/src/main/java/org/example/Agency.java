package org.example;

public class Agency implements Observer {
    private String name;

    public Agency(String name) {
        this.name = name;
    }

    @Override
    public void update(String newState) {
        System.out.println(name + ": Stock market status change into: " + newState);
    }
}
