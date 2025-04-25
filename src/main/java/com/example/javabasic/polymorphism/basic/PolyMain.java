package com.example.javabasic.polymorphism.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("==== parent -> parent =====");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("==== child -> child =====");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println("==== parent -> child =====");
        Parent poly = new Child(); //parent CAN become child instance
        poly.parentMethod();
        //poly.childMethod(); // poly is Parent type, CAN NOT call child method



    }
}
