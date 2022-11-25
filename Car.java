package org.example;

import java.util.Scanner;
// class Car with the following fields
public class Car {

    int year;
    double price;
    boolean isSportCar;
    double fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

// creating a constructor
    public Car(int year, double price, boolean isSportCar, double fuelTankCapacity, double freeFuel, String engineFuelOperationSystem) {
        this.year = year;
        this.price = price;
        this.isSportCar = isSportCar;
        this.fuelTankCapacity = fuelTankCapacity;
        this.freeFuel = freeFuel;
        this.engineFuelOperationSystem = engineFuelOperationSystem;
    }
// method newEngineFuelOperationSystem
    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem) {

        this.engineFuelOperationSystem = newEngineFuelOperationSystem;
        System.out.println("newEngineFuelOperationSystem = " + engineFuelOperationSystem);
    }

    // method useFuel
    public void useFuel(double fuel) {

        double usedFuel = freeFuel- fuel;
        if (usedFuel < 0) System.out.println("Not enough free fuel!");
        else {freeFuel = usedFuel;}
        }

// method to check whether the car is sport car and
   public void checkOn() {

        if (isSportCar) {
        System.out.println("The car is a sport car ");}
        else {
            System.out.println("The car is not a sport car");
        }
    }
// short cut toString method
    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", price=" + price +
                ", isSportCar=" + isSportCar +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", freeFuel=" + freeFuel +
                ", engineFuelOperationSystem='" + engineFuelOperationSystem + '\'' +
                '}';
    }

}

