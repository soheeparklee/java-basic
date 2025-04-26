package com.example.javabasic.polymorphism2.car1;

public class Driver {
    private Car car;

    public void setCar(Car car){
        this.car = car;
    }

    public void drive(){
        System.out.println("driver is driving");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
