package org.example.comportamental.template;

public class TemplateMethodImpl {
    public static void main(String[] args) {
        Phone iphone = new Iphone();
        Phone samsung = new Samsung();

        iphone.contain();
        System.out.println("--------");
        samsung.contain();
    }
}
