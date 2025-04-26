package com.example.javabasic.polymorphism2.car1;

public class Model3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("Model 3 car startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Model 3 car offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model 3 car pressAccelerator");
    }
}
