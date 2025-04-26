package com.example.javabasic.interface1.extends1;

public class Bird extends Animal implements Fly{
    @Override
    public void sound() {} //MUST override from extends parent class

    @Override
    public void fly() {} //MUST override from interface
}
