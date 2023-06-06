package org.example.structural.Adapter;

class Samsung implements TypeC{
    @Override
    public void energyAccumulation() {
        System.out.println("Samsung is charging");
    }
}
