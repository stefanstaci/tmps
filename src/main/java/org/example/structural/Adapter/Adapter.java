package org.example.structural.Adapter;

class Adapter implements Lightning{
    TypeC typeC;

    public Adapter(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void charging() {
        typeC.energyAccumulation();
    }
}
