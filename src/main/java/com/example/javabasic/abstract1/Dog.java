package com.example.javabasic.abstract1;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("woof");
    }
    //child class MUST override abstract method
    //child class: 메소드 실제 구현
}
