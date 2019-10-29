/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.lab.inheritence;

/**
 *
 * @author Admin
 */
public class BasePlusCommission extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommission(double baseSalary, String firstName, String lastName, double grossSales, double commissionRate) {
        super(firstName, lastName, grossSales, commissionRate);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
       if(baseSalary > 500){
        this.baseSalary = baseSalary;
       }
       else {
           System.out.println("Base salary less than 500");
           this.baseSalary =  baseSalary;
       }
    }
    
    //earnings method
    @Override 
    public double earnings(){
      return super.earnings() * baseSalary;  
    }

    @Override
    public String toString() {
        return "BasePlusCommission{" + "baseSalary=" + baseSalary + '}';
    }
    
   
}
