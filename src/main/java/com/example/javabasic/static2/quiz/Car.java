package com.example.javabasic.static2.quiz;

public class Car {
    private String name;
    private static int count;

    public Car(String name) {
        this.name = name;
        System.out.println("name: " + name);
        count++;
    }

    public static void showTotalCars(){
        System.out.println("total cars: "+ count);
    }
}
