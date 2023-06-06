package org.example.creational.prototype;

public class PrototypeImpl {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cache cache = new Cache();
        cache.setIphone(new Iphone("13 Pro", "700$", "black"));

        Iphone iphone = cache.getIphone();
        System.out.println(iphone.toString());
    }
}
