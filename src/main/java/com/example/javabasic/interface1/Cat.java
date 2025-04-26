package com.example.javabasic.interface1;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

public class Cat implements Animal{


    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void move() {
        System.out.println("move like cat");
    }
}
