package org.example.structural.Filter;

public class Iphone {
    private String name;
    private String color;
    private String price;
    private String memory;

    public Iphone(String name, String color, String price, String memory) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
