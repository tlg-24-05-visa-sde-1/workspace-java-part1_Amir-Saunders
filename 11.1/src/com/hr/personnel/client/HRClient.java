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

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        SalariedEmployee se1 = new SalariedEmployee("Steve",LocalDate.of(2005,8,23),7500000);
        HourlyEmployee hr1 = new HourlyEmployee("John",LocalDate.of(2012,5,15),25.2,20);
//        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24),75000.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2),25.2,45));
        dept.addEmployee(se1);
        dept.addEmployee(hr1);
//        the addEmplyee method in departemnt takes an employee object as the arguement and salariedemployee and hourly employee extend employee whwihc means it's recognized as an employee object' it adds it to theemplyee array which is afield in the department class.



        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();
        se1.pay();
        hr1.pay();
        dept.workEmployees();
        dept.payEmployees();
//        dept.payemployees calls employees[i].pay(). the pay method funcions diffrently depending if the person is a regualr employee or hourlyemplyee or salaried employee. Each has the pay method. but the two subclasses Alaried employee and Hourly employee extend employee and overide the pay method. So a regualr employee or hourlyemplyee or salaried employee will have diffrent outputs
//        The ouput for this would be
//        Jason is paid soomehow - regualr employee
//        Julie is paid soomehow - regualr employee
//        Steve paid 7500000.0 - salaried employee
//        John is paid 20.0 hours - hourly employee

        dept.listEmployees();
        dept.workEmployees();
//        This would ouput the same for the regualr emmployees and the classes that extend employees hourly and salary because there is no overidding metho in hourly or salary but only in the parent class employees
    }
}