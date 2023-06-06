package org.example.creational.prototype;

class Iphone implements Cloneable {
    private String name;
    private String price;
    private String color;

    public Iphone(String name, String price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    protected Iphone clone() throws CloneNotSupportedException {
        return (Iphone) super.clone();
    }
}
