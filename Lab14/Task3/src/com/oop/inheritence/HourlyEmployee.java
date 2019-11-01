/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
package com.oop.inheritence;

/**
 *
 * @author Admin
 */
public class HourlyEmployee extends Employee {
private double wage;
private double hours;

    public HourlyEmployee(double wage, double hours, String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
       if(wage >= 0){
        this.wage = wage;
       }
       else{
           this.wage =  wage*(-1);
       }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours > 0 && hours < 168){
            this.hours = hours;
            
        }
        else if(hours  <  0) 
        {
            this.hours =   0;
        }
        else {
            this.hours =  168;
        }
        
        this.hours = hours;
    }

public double earnings(){
    return 1.5  * hours * wage;
//this logic is lousy I could've made it better by only increasing 1.5x wages for work done after 40 hours but let's do inheritence first
}
    
    
}
