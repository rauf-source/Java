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
public class CommissionEmployee {
    
    //firstName, LastName, grossSales and commissionRate
    private String firstName;
    private String lastName;
    private double grossSales;
    private double commissionRate;
    
    //constructor

    public CommissionEmployee(String firstName, String lastName, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        setGrossSales(grossSales);
        this.commissionRate = commissionRate;
    }
    
    
    
   
  

//The checking part was unclear it said to check that gsales must be bigger than 0, if it is not then there must be a hardcode value but none provided
    public void setGrossSales(double grossSales) {
        //class, you have to check that grossSales must be greater than zero and 
        if(grossSales > 0){
        this.grossSales = grossSales;
        }
        else{
            System.out.println("gross sales is less than or equal to zero");
            this.grossSales =  0;
        }
      }

 
    public void setCommissionRate(double commissionRate) {
       if(commissionRate > 0 && commissionRate < 1){
        this.commissionRate = commissionRate;
       }
       else {
           System.out.println("!!!Comission rate not in the range of 0- 1");
           this.commissionRate =  0;
           
       }
    }

     public double earnings(){
        return commissionRate * grossSales;
    }

    
    
    @Override
    public String toString() {
        return "CommissionEmployee{" + "firstName=" + firstName + ", lastName=" + lastName + ", grossSales=" + grossSales + ", commissionRate=" + commissionRate + '}';
    }
    
    
}
