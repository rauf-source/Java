/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.technocrats.developers;

/**
 *
 * @author Admin
 */
public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(double weeklySalary, String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "SalarizedEmployee{" + "weeklySalary=" + weeklySalary + '}';
    }
//getPaymentAmount() of SalariedEmployee class returns weeklySalary
    @Override
    public double getPayableAmount() {
        return weeklySalary;
    }
    
}
