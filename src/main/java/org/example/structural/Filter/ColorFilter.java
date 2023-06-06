package org.example.structural.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ColorFilter implements IphoneFilter{
    @Override
    public List<Iphone> filter(List<Iphone> iphones) {
        List<Iphone> list = new ArrayList<>();
        for (Iphone iphone : iphones) {
            if (iphone.getColor().equals("black")) {
                list.add(iphone);
            }
        }
        return list;
    }
}
