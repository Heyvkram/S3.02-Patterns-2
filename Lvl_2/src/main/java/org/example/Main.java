package org.example;

public class Main {
    public static void main(String[] args) {
        Broker agent = new Broker();

        Agency agency1 = new Agency("agency 1");
        Agency agency2 = new Agency("agency 2");
        Agency agency3 = new Agency("agency 3");

        agent.addObserver(agency1);
        agent.addObserver(agency2);
        agent.addObserver(agency3);

        agent.setState("Up");
        agent.setState("Down");

        agent.removeObserver(agency2);

        agent.setState("Stable");
    }
}