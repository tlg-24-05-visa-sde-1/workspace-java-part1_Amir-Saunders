package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee implements TaxPayer {


    double rate;
    double hours;
    double DEFAULT_STANDARD_DEDUCTION = 65000.00;


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

    private double getRate() {
        return (rate * hours) * TaxPayer.HOURLY_TAX_RATE;
    }

    @Override
    public void pay() {
        System.out.println(super.getName() + " is paid " + hours + " hours");
    }

    @Override
    public void payTaxes() {
        System.out.println(super.getName() + " paid taxes of " + getRate());
    }

    //    In Java, if a parent class implements an interface, and its subclasses also implement the same interface, then the parent class does not have to implement the methods from the interface explicitly.
    @Override
    public double getStandardDeduction() {
        return DEFAULT_STANDARD_DEDUCTION;
    }
}
