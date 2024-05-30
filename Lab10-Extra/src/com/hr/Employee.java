package com.hr;

import com.transportation.Car;

public class Employee {
    // INSTANCE VARIABLES
    private String name;


    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    public void goToWork(String vin,String make,String model) {
        // TODO: create an instance of Car with all three properties: vin, make, model
        /* When you instantiate an outer object inside a method in another class you have to put the arguements of the outer object in the method like it's done below and the impotr of the car object is above*/
            Car car1 = new Car(vin, make, model);

        // TODO: call moveTo() on the Car object, passing "West Seattle" for the destination
        car1.moveTo("West Seattle");


        System.out.println("Arrived at work");
    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}