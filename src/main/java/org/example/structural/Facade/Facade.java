package org.example.structural.Facade;

public class Facade {
    ActivePhone activePhone = new ActivePhone();
    Iphone iphone = new Iphone();
    Work someWork = new Work();

    void isWorking() {
        someWork.isWorking();
        activePhone.startPhone();
        iphone.work(activePhone);
    }
}
