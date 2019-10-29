/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.inheritance;

/**
 *
 * @author Admin
 */
public class CommissionEmployee extends Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
     // five-argument constructor
 public CommissionEmployee(String firstName, String lastName,
 String socialSecurityNumber, double grossSales,
 double commissionRate)
 {
 // implicit call to Object constructor occurs here

 // if grossSales is invalid throw exception
 if (grossSales < 0.0)
 throw new IllegalArgumentException(
 "Gross sales must be >= 0.0");

 // if commissionRate is invalid throw exception
 if (commissionRate <= 0.0 || commissionRate >= 1.0)
 throw new IllegalArgumentException(
 "Commission rate must be > 0.0 and < 1.0");

 this.firstName = firstName;
 this.lastName = lastName;
 this.socialSecurityNumber = socialSecurityNumber;
 this.grossSales = grossSales;
 this.commissionRate = commissionRate;
 } // end constructor

 // return first name
 public String getFirstName()
 {
 return firstName;
 }

 // return last name
 public String getLastName()
 {
 return lastName;
 }

 // return social security number
 public String getSocialSecurityNumber()
 {
 return socialSecurityNumber;
 }

 // set gross sales amount
 public void setGrossSales(double grossSales)
 {
 if (grossSales < 0.0)
 throw new IllegalArgumentException(
 "Gross sales must be >= 0.0");

 this.grossSales = grossSales;
 } 
}
