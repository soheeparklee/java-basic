package com.example.javabasic.abstract1;

public class AnimalMain {
    public static void main(String[] args) {
        //Animal animal = new Animal(); //abstract class instance impossible

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);


    }

    private static void soundAnimal(Animal animal) {
        System.out.println("=====start=====");
        animal.move();
        System.out.println("=====end=====");
    }
}
