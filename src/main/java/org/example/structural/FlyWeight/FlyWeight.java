package org.example.structural.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeight {
    Map<String, Phone> map = new HashMap<>();
    Phone getPhone(String name) {
        Phone phone = map.get(name);
        if (phone == null) {
            phone = new Phone();
            phone.name = name;
            map.put(name, phone);
        }
        return phone;
    }
}
