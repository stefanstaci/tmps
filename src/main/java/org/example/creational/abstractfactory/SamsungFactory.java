package org.example.creational.abstractfactory;

class SamsungFactory implements Factory {
    public Samsung createSamsung(String typeOfSamsung) {
        return switch (typeOfSamsung) {
            case "GalaxyA3" -> new GalaxyA3();
            case "GalaxyS40" -> new GalaxyS40();
            default -> null;
        };
    }

    @Override
    public Apple createApple(String typeOfApple) {
        return null;
    }
}
