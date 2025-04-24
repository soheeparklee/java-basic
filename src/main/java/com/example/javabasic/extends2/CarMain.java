package com.example.javabasic.extends2;


public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        Car car = new Car();
        car.move();
        //car.charge();

        HydroCar hydroCar = new HydroCar();
        hydroCar.openDoor();
        hydroCar.fillHydrogen();

    }

}
