package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
//    This subclass was created by highlighting the parent class employee and then pressing options enter and then you enter the subclass name and make the constructors and that class wil extend the parent class

    double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(double salary) {
        this.salary = salary;
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                '}' + getName()  + "Is the name"   + getHireDate();
    }
    @Override
    public void pay(){
        System.out.println(super.getName() + " paid " + salary);
    }

    public void takeVacation(){
        System.out.printf("%s is on vacation",getName());
    }
}
