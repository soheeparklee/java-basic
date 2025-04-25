package com.example.javabasic.polymorphism.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; //upcasting
        Parent parent2 = child;

        parent1.parentMethod();

        Parent parent = new Child();
        Child child1 =  (Child) parent;
    }
}
