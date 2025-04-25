package com.example.javabasic.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        super();
        System.out.println("Class B constructor a=" + a);
    }

    public ClassB(int a, int b){
        super();
        System.out.println("Class B constructor a= " + a + " b= "+ b);
    }
}
