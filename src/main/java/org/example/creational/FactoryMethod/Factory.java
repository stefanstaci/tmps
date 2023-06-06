package org.example.creational.FactoryMethod;

public class Factory {
    public Phone create(String typeOf) {
        return switch (typeOf) {
            case "Apple" -> new Apple();
            case "Samsung" -> new Samsung();
            default -> null;
        };
    }
}
