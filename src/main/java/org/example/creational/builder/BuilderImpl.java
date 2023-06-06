package org.example.creational.builder;

public class BuilderImpl {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder("Iphone").setColor("black").setPrice("700$").build();
        System.out.println(phone.getName() + " " + phone.getColor() + " " + phone.getPrice());
    }
}

