package com.example.javabasic.polymorphism.ex2;

public class AnimalSoundPolyMain3 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.sound();

        Animal[] animalArr = {new DogPoly(), new CatPoly(), new CowPoly()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("=====start=====");
        animal.sound();
        System.out.println("=====end=====");
    }
}
