package org.example.creational.abstractfactory;

interface Factory {
    Samsung createSamsung(String typeOfSamsung);

    Apple createApple(String typeOfApple);
}
