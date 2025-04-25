package com.example.javabasic.polymorphism.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent parentPoly = new Child();
        //poly.childMethod(); //only can call type method

        Child childPoly = (Child) parentPoly; //Downcasting //change parent type to child type
        childPoly.childMethod(); //now can call childMethod();
        //poly type: parent
        //childPoly type: child

        Parent downPolyTemp = new Child();
        ((Child) downPolyTemp).childMethod(); //temporal downcasting

    }
}
