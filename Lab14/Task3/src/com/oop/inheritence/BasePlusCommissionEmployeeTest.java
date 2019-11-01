/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oop.inheritence;

/**
 *
 * @author Admin
 */ public class BasePlusCommissionEmployeeTest
 {
 public static void main(String[] args)
 {
     //double grossSales, double commissionRate, String firstName, String lastName, String socialSecurityNumber
 // instantiate CommissionEmployee object
     //double grossSales, double commissionRate, double baseSalary, String firstName, String lastName, String socialSecurityNumber
BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(5000, 0.4, 300, "Bob", "Lewis", "333-33-3333");
//"Bob", "Lewis", "333-33-3333", 5000, .04, 300

 // get commission employee data
 System.out.println(
 "Employee information obtained by get methods:");
 System.out.printf("%n%s %s%n", "First name is",employee.getFirstName()
 );
 System.out.printf("%s %s%n", "Last name is",employee.getLastName()
 );
 System.out.printf("%s %s%n", "Social security number is",employee.getSocialSecurityNumber()
 );
 System.out.printf("%s %.2f%n", "Gross sales is",employee.getGrossSales()
 );
 System.out.printf("%s %.2f%n", "Commission rate is",employee.getCommissionRate()
 );
System.out.printf("%s %.2f%n", "Base salary is",employee.getBaseSalary());
     
employee.setBaseSalary(1000);

 System.out.printf("%n%s:%n%n%s%n",
 "Updated employee information obtained by toString", employee.toString());
 } // end main
 } 