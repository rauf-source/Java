/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.inheritence;

/**
 *
 * @author Admin
 */
public class CommissionEmployee extends Employee{
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
// five-argument constructor

    public CommissionEmployee(double grossSales, double commissionRate, String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

   

 public void setGrossSales(double grossSales){
 if (grossSales < 0.0)
 throw new IllegalArgumentException(
 "Gross sales must be >= 0.0");

 this.grossSales = grossSales;
 } 
    
 public double getGrossSales()
 {
 return grossSales;
 }

 // set commission rate
 public void setCommissionRate(double commissionRate)
 {
 if (commissionRate <= 0.0 || commissionRate >= 1.0)
 throw new IllegalArgumentException(
 "Commission rate must be > 0.0 and < 1.0");

 this.commissionRate = commissionRate;
 }

 // return commission rate
 public double getCommissionRate()
 {
 return commissionRate;
 }

 // calculate earnings
 public double earnings()
 {
 return getCommissionRate() * getGrossSales() ;
 }

 // return String representation of CommissionEmployee object

    @Override
    public String toString() {
        return super.toString() + "CommissionEmployee{" + "grossSales=" + grossSales + ", commissionRate=" + commissionRate + '}';
    }

} // end class CommissionEmployee
