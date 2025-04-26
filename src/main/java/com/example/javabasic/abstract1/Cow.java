package com.example.javabasic.abstract1;

public class Cow extends Animal{
    @Override
    public void sound() {
        System.out.println("mooooo");
    }
    //child class MUST override abstract method
    //child class: 메소드 실제 구현
}
