package com.example.javabasic.polymorphism.ex2;

import com.example.javabasic.polymorphism.ex1.Cat;

public class AnimalSoundPolyMain {
    public static void main(String[] args) {
        DogPoly dogPoly = new DogPoly();
        CatPoly catPoly = new CatPoly();
        CowPoly cowPoly = new CowPoly();

        animalSound(dogPoly);
        animalSound(catPoly);
        animalSound(cowPoly);


    }
    private static void animalSound(Animal animal){
        System.out.println("=====start=====");
        animal.sound(); //overrided method is called
        System.out.println("=====end=====");
    }
}
