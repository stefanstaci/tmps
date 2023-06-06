package org.example.structural.FlyWeight;

public class FlyWeightImpl {
    public static void main(String[] args) {
        FlyWeight flyWeight = new FlyWeight();
        Phone phone1 = flyWeight.getPhone("Iphone 12");
        Phone phone2 = flyWeight.getPhone("Iphone 12");
        System.out.println(phone1.equals(phone2));
        System.out.println(phone1.hashCode());
        System.out.println(phone2.hashCode());
    }
}
