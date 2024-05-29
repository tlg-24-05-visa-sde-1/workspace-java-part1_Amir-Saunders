package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee implements TaxPayer {
//    This subclass was created by highlighting the parent class employee and then pressing options enter and then you enter the subclass name and make the constructors and that class wil extend the parent class

    double salary;
    double DEFAULT_STANDARD_DEDUCTION = 55000.00;

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
                '}' + getName() + "Is the name" + getHireDate();
    }

    @Override
    public void pay() {
        System.out.println(super.getName() + " paid " + salary);
    }


    private double getRate() {
        return salary * TaxPayer.SALARIED_TAX_RATE;
    }

    @Override
    public void payTaxes() {
        System.out.println(super.getName() + " paid taxes of " + getRate());
    }


    //    Since salariedEmployee implements TaxPayer it has acess to the public static final variables like TaxPayer.SALARIED_TAX_RATE
//In Java, if a parent class implements an interface, and its subclasses also implement the same interface, then the parent class does not have to implement the methods from the interface explicitly.
    @Override
    public double getStandardDeduction() {
        return DEFAULT_STANDARD_DEDUCTION;
    }



}
