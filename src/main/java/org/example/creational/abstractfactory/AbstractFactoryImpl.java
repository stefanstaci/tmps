package org.example.creational.abstractfactory;

public class AbstractFactoryImpl {
    public static void main(String[] args) {
        Factory samsungFactory = new AbstractFactory().createFactory("SamsungFactory");
        Samsung galaxyA3 = samsungFactory.createSamsung("GalaxyA3");
        Samsung galaxyS40 = samsungFactory.createSamsung("GalaxyS40");
        galaxyA3.work();
        galaxyS40.work();
        Factory appleFactory = new AbstractFactory().createFactory("AppleFactory");
        Apple iphone12 = appleFactory.createApple("Iphone12");
        Apple iphone13Pro = appleFactory.createApple("Iphone13Pro");
        iphone12.work();
        iphone13Pro.work();
    }
}


