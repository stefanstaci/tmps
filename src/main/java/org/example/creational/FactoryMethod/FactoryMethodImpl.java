package org.example.creational.FactoryMethod;


public class FactoryMethodImpl {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Phone apple = factory.create("Apple");
        Phone samsung = factory.create("Samsung");
        apple.isWorking();
        samsung.isWorking();
    }
}

