/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
//    Employees is a public class that allows department to have access to it.
//    Employee class being public means that it can be accessed and instantiated from other classes in the same package or even from classes in different packages, assuming the appropriate import statements are used.
    private int currentIndex = 0;  // for dealing with the array

    // constructors
    public Department() {
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(employees[i]);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].work();
//            Work is a method from the employee class. It is accesible here because employees is an array of the employee object so since employees array is an array of employees you can use               the work method
        }
    }


    public void holidayBreak(){
        for(int i =0;i<currentIndex;i++){
            if(employees[i] instanceof SalariedEmployee){
                SalariedEmployee semp = (SalariedEmployee) employees[i];
                semp.takeVacation();
            }
        }
    }
    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees[currentIndex++] = emp;
//        The expression employees[currentIndex] = emp assigns the Employee object emp to the current position indicated by currentIndex.

    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "Department: name=" + getName() + ", location=" + getLocation();
    }

    public void payEmployees(){
        for (int i = 0; i < currentIndex; i++) {
            employees[i].pay();

            // pay is a method from the employee class. It is accesible here because employees is an array of the employee object so since employees array is an array of employees you can use   the pay method. pay will function diffrently depending on wether ts a salary employee or hour;y employee because of polymorphism
        }
    }
}