package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {


    double rate;
    double hours;



    public HourlyEmployee() {
    }


    public HourlyEmployee(double rate, double hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "rate=" + rate +
                ", hours=" + hours +
                '}' + getName() + getHireDate();
    }

    @Override
    public void pay(){
        System.out.println(super.getName() + " is paid " + hours + " hours");
    }
}
