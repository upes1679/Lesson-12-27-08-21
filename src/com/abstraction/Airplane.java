package com.abstraction;

public class Airplane extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Airplane engine is running");

    }

    @Override
    public void stopEngine() {
        System.out.println("Airplane engine has stopped running");
    }

    public Airplane(String engine) {
        super(engine);
    }
}
