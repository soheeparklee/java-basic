package com.example.javabasic.interface1;

public class InterfaceMain {
    public static void main(String[] args) {
        //Animal animal = new Animal(); //cannot create interface instance

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    private static void soundAnimal(Animal animal){
        System.out.println("=====start=====");
        animal.sound();
        System.out.println("=====end=====");
    }
}
