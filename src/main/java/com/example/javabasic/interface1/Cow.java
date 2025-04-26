package com.example.javabasic.interface1;

public class Cow implements Animal{
    @Override
    public void sound() {
        System.out.println("mooo");
    }

    @Override
    public void move() {
        System.out.println("move like cow");
    }
}
