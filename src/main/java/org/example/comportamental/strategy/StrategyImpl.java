package org.example.comportamental.strategy;

public class StrategyImpl {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.setActivity(new Waiting());
        iphone.executeActivity();

        iphone.setActivity(new Running());
        iphone.executeActivity();

        iphone.setActivity(new Sleeping());
        iphone.executeActivity();
    }
}
