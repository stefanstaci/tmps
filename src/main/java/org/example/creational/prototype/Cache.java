package org.example.creational.prototype;

public class Cache {
    private Iphone iphone;

    public Iphone getIphone() throws CloneNotSupportedException {
        return iphone.clone();
    }

    public void setIphone(Iphone iphone) {
        this.iphone = iphone;
    }
}
