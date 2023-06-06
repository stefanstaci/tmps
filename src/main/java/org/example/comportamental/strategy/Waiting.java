package org.example.comportamental.strategy;

public class Waiting implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Waiting... ");
    }
}
