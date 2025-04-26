package com.example.javabasic.polymorphism.ex2;

public class AnimalSoundPolyMain2 {
    public static void main(String[] args) {
        DogPoly dog = new DogPoly();
        CatPoly cat = new CatPoly();
        CowPoly cow = new CowPoly();

        Animal[] animalArr = {dog, cat, cow};

        for (Animal animal : animalArr) {
            System.out.println("=====start=====");
            animal.sound();
            System.out.println("=====end=====");
        }



    }
}
