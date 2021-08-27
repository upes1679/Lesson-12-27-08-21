package com.abstraction;

public class Car extends Vehicle{
    public Car(String engine) {
        super(engine);
    }

    @Override
    public void startEngine(){
        System.out.println("Car engine is running");
    }

    @Override
    public void stopEngine() {

        System.out.println("Car engine has stopped running");
    }
}
