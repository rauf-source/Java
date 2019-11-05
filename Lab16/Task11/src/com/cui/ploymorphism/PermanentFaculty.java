/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.ploymorphism;

/**
 *
 * @author sp19-bse-043
 */
public class PermanentFaculty extends Faculty{
    //Class PermanentFaculty has one attribute salary, fully parametrized constructor and
//overrides calculateSalary() method
private double salary;

    public PermanentFaculty(double salary, int id, String name) {
        super(id, name);
        this.salary = salary;
    }
public double calculateSalary(){
    return salary;
}



}
