package org.example.creational.abstractfactory;

class AppleFactory implements Factory {
    public Apple createApple(String typeOfApple) {
        return switch (typeOfApple) {
            case "Iphone12" -> new Iphone12();
            case "Iphone13Pro" -> new Iphone13Pro();
            default -> null;
        };
    }

    @Override
    public Samsung createSamsung(String typeOfSamsung) {
        return null;
    }
}
