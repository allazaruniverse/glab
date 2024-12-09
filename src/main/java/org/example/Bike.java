package org.example;

public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("This Bike is analog. You will have to pedal.");
    }
    public void stop(){
        System.out.println("This Bike has foot brakes. Push backwards to stop.");
    }
}
