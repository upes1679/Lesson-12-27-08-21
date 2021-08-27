package com.abstraction;

public abstract class Ship extends Vehicle {
    public Ship(String engine) {
        super(engine);
    }

    public abstract void sink();
    @Override
    public void startEngine(){
        System.out.println("Ship engine started");
    };
    @Override
    public abstract void stopEngine();
}
