package org.example.comportamental.strategy;

public class Sleeping implements Activity{

    @Override
    public void justDoIt() {
        System.out.println("Sleeping... ");
    }
}
