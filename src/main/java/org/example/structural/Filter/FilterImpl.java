package org.example.structural.Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterImpl {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("Iphone 12", "black", "700$", "1Tb");
        Iphone iphone2 = new Iphone("Iphone 12 pro", "purple", "900$", "256Gb");
        Iphone iphone3 = new Iphone("Iphone 13", "blue", "900$", "5Tb");
        Iphone iphone4 = new Iphone("Iphone 14", "black", "1000$", "1Tb");

        List<Iphone> iphones = new ArrayList<>();
        iphones.add(iphone1);
        iphones.add(iphone2);
        iphones.add(iphone3);
        iphones.add(iphone4);

        iphones = new ColorFilter().filter(iphones);

        for (Iphone iphone : iphones) {
            System.out.println(iphone.getName() + " " + iphone.getColor());
        }
    }
}
