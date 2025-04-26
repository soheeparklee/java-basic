package com.example.javabasic.interface1;

public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("woof");
    }

    @Override
    public void move() {
        System.out.println("move like dog");
    }
}
