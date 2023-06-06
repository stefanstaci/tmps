package org.example.structural.Facade;

public class ActivePhone {
    boolean activePhone;

     boolean isActivePhone() {
        return activePhone;
    }

    void startPhone() {
        System.out.println("phone is active");
        activePhone = true;
    }

    void stopPhone() {
        System.out.println("phone is not active");
        activePhone = false;
    }
}
