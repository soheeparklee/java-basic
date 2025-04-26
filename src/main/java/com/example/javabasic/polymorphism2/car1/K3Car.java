package com.example.javabasic.polymorphism2.car1;

public class K3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("K3 car startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("K3 car offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3 car pressAccelerator");
    }
}
