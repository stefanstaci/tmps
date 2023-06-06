package org.example.structural.Facade;

public class Iphone {
    void work(ActivePhone activePhone) {
        if (activePhone.isActivePhone()) {
            System.out.println("phone is active, it works");
        }else {
            System.out.println("phone is not active, it economise the accumulator power");
        }
    }
}
