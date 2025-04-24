package com.example.javabasic.overriding;

public class ElectricCar extends Car {
    @Override
    public void move(){
        System.out.println("move electric car super fast");
    }

    public void charge(){
        System.out.println("charge electric car");
    }
}
