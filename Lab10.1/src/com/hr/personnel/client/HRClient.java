/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import gov.irs.IllegalWageException;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        try {
            dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 2250.0));
            dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 35.0, 30.0));
            dept.addEmployee(new SalariedEmployee("Amilia", LocalDate.of(1999, 2, 6), 1250.0));
            dept.addEmployee(new HourlyEmployee("Logan", LocalDate.of(2002, 6, 2), 40.0, 40.0));
        } catch (IllegalWageException e) {
            System.out.println("   ERROR:  " + e.getMessage());
        }
        /*I put the declaring of new objects inside a try catch because. HourlyEmployee is throwing a checked exception called IllegalWageException in the constructor. This means that when you instantiate a new hourly employee it has to go inside a try catch block it looks like this public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) throws IllegalWageException*/


        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay its Employees
        System.out.println("\nPay all employees:");
        dept.payEmployees();
    }
}