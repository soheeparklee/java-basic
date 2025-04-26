package com.example.javabasic.abstract1;

public class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void move() {
        System.out.println("move like cat");
    }
    //child class MUST override abstract method
    //child class: 메소드 실제 구현
}
