package org.example;

import java.util.Scanner;

public class CarPerson {
    public static void main(String[] args) {
        // creating objects
        Car car1 = new Car(2020, 20500, true, 60, 45, "Electric");
        Car car2 = new Car(2012, 10500, false, 60, 45, "Petrol");
        // changing the parameters
        car2.changeEngineFuelOperationSystem("Diesel");
        car1.useFuel(35);
        car1.checkOn();
// using the toString method
        System.out.println(car1);
        System.out.println(car2);


//

    }



}

