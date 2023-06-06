package org.example.creational.abstractfactory;

class AbstractFactory {
    public Factory createFactory(String typeOfFactory) {
        return switch (typeOfFactory) {
            case "SamsungFactory" -> new SamsungFactory();
            case "AppleFactory" -> new AppleFactory();
            default -> null;
        };
    }
}
