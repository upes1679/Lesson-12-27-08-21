package com.abstraction;

public class Main {

    public static void main(String[] args) {
//        Vehicle car=new Vehicle("engine name") {
//            @Override
//            public void startEngine() {
//                System.out.println("Car engine started");
//            }
//
//            @Override
//            public void stopEngine() {
//                System.out.println("Car engine started stopped");
//            }
//        };
        Vehicle v=new Car("2000");
        Vehicle v1=new Car("1400");
        v.startEngine();
        v.stopEngine();
        v=new Airplane("Boeing engine");
        v.startEngine();
        v.stopEngine();
    }
}
