package com.example.javabasic.polymorphism.ex1;

public class AnimalSoundPolyMain {
    public static void main(String[] args) {
        Animal dogPoly = new DogPoly();
        Animal catPoly = new CatPoly();
        Animal cowPoly = new CowPoly();

        animalSound(dogPoly);
        animalSound(catPoly);
        animalSound(cowPoly);


    }
    static void animalSound(Animal animal){
        System.out.println("=====start=====");
        animal.sound();
        System.out.println("=====end=====");
    }
}
