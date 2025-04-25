package com.example.javabasic.polymorphism.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.sound();
        cat.sound();
        cow.sound();
    }

    private static void sound(){

    }
}
