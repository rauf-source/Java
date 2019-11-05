/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.ploymorphism;

/**
 *
 * @author sp19-bse-043
 *///Class VisitingFaculty() has two attributes hours,salaryPerHr, fully parametrized
//constructor and overrides calculateSalary() met
//hod
public class VisitingFaculty extends Faculty{
 private double hours;
 private double salaryPerHr;

    public VisitingFaculty(double hours, double salaryPerHr, int id, String name) {
        super(id, name);
        this.hours = hours;
        this.salaryPerHr = salaryPerHr;
    }
 public double calculateSalary(){
     return hours * salaryPerHr;
 }
 
}
