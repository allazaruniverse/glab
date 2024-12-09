package org.example;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("This car is a push button start");
    }
    public void stop(){
        System.out.println("This isn't the Flintstones. This car uses brakes like they all do.");
    }
}
