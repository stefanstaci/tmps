package org.example.structural.Adapter;

public class AdapterImpl {
    public static void main(String[] args) {
        Charger charger = new Charger();
        charger.chargingPhone(new Iphone());
        charger.chargingPhone(new Adapter(new Samsung()));
    }
}
