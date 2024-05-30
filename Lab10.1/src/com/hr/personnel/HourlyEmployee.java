/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import gov.irs.IllegalWageException;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // fields
    private double rate;
    private double hours;
    public static final double FEDERAL_MINIMUM_WAGE = 15.0;

    // constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass ctor for name, hireDate
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) throws IllegalWageException {
        this(name, hireDate);
        /* throws IllegalWageException on the line where im declaring setRate  is from the class IllegalWageeException class that extnds execption. This is called a checked exception if you have a checked exception meaning it came from a class that extends exception in this case is the class IllegalWageException and checked exceptions are a subclasses of Exception but not subclasses of RuntimeException.*/
        if(rate < FEDERAL_MINIMUM_WAGE) {
            throw new IllegalWageException("Illegal wage is: " + rate + " Federal minimum wage is " + FEDERAL_MINIMUM_WAGE);
            /*To find where set rate is being used right click it and hit find usages
            that's a common practice in Java. Generally, you throw an exception when an error condition occurs within a method. Then, when you call that method, you use a try-catch block to handle the exception.
            throws IllegalWageException  is from the class IllegalWaheException that extnds execption. This is called a checked exception*/
        }else {
            setRate(rate); // delegate to neighboring ctor for name, hireDate
        }
                  // handle rate here, by delegating to setter
        setHours(hours);        // handle hours here, by delegating to setter
    }

    // business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }

    @Override  // interface TaxPayer
    public void payTaxes() {
        double taxes = getRate() * getHours() * HOURLY_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    // accessor methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) throws IllegalWageException {
         /*throws IllegalWageException on the line where im declaring setRate  is from the class IllegalWageeException class that extnds execption. This is called a checked exception if you have a checked exception meaning it came from a class that extends exception in this case is the class IllegalWageException*/
       if(rate < FEDERAL_MINIMUM_WAGE) {
           throw new IllegalWageException("Illegal wage is: " + rate + " Federal minimum wage is " + FEDERAL_MINIMUM_WAGE);
           /*To find where set rate is being used right click it and hit find usages
           that's a common practice in Java. Generally, you throw an exception when an error condition occurs within a method. Then, when you call that method, you use a try-catch block to handle the exception.
            */
       }
       this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}