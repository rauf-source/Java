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
public class BasePlusCommissionEmployee extends CommissionEmployee{
   
    private double baseSalary;

// five-argument constructor
//double grossSales, double commissionRate, String firstName, String lastName, String socialSecurityNumber
    public BasePlusCommissionEmployee(double grossSales, double commissionRate, double baseSalary, String firstName, String lastName, String socialSecurityNumber) {
        super(grossSales, commissionRate,firstName, lastName, socialSecurityNumber);
      
        this.baseSalary =  baseSalary;
      
    }

    


    public double getBaseSalary() {
        return baseSalary;
    }
//coded by rauf-source. credit my gh link on usage :)
 // set commission rate
 

 // calculate earnings
 public double earnings()
 {
   //  System.out.println(getBaseSalary() );
 return getGrossSales() * getCommissionRate() +  baseSalary;
   
 }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateBonus() {
    //    System.out.println(earnings());
         if(earnings() > 10000 && earnings() <20000){
        return   5000;
    }
    else if(earnings() >= 20000 && earnings() <50000){
        return   10000;
    }
   else if (earnings() > 50000){
        return   20000;
        
    }
    else{
            return 0;
    }

      
    }
 
 // return String representation of CommissionEmployee object

    @Override
    public String toString() {
        return super.toString() + "CommissionEmployee{" + "grossSales=" + baseSalary + ", commissionRate=" + calculateBonus() + '}';
    }

} // end class CommissionEmployee
//coded by rauf-source. credit my gh link on usage :) 