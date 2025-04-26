package com.example.javabasic.abstract1;

public abstract class Animal {
    public abstract void sound();
    //only in abstract class
    //MUST be overrided by child class
    //abstract method has no body(will be overrided by child class)
    //parent class: 메소드를 정의만 하고

    public void move(){
        System.out.println("animal is moving");
    }
    //not abstract method
    //override not mandatory
}
