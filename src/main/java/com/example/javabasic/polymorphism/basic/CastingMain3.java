package com.example.javabasic.polymorphism.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        //Child child1 =  parent1; //not possible
        Child child1 = (Child) parent1; //downcasting
        child1.childMethod(); //now can call childMethod()

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //🔴error, parent2 is parent instance thus downcasting not possible
        child2.childMethod();
    }
}
