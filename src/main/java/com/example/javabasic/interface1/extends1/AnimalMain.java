package com.example.javabasic.interface1.extends1;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        //Fly flyDog = dog; //🔴 not possible, dog did not implement fly
        Fly flyBird = bird;

        //flyAnimal(dog); //🔴 not possible, dog did not implement fly
        flyAnimal(bird);
        flyAnimal(chicken);
    }

    private static void flyAnimal(Fly fly){
        fly.fly();
    }
}
