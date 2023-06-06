package org.example.comportamental.template;

public abstract class Phone {
    public void contain() {
        System.out.println("screen");
        particularPhoneContain();
        System.out.println("battery");
    }

    public abstract void particularPhoneContain();
}
