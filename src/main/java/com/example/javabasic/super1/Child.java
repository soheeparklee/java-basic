package com.example.javabasic.super1;

public class Child extends Parent{
    public String value = "child";

    @Override
    public void hello(){
        System.out.println("child.hello");
    }

    public void call(){
        System.out.println("this.value= " + this.value);
        System.out.println("super.value= " + super.value); //find in parent

        this.hello();
        super.hello();
    }
}
