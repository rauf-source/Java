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
public class Student extends Person{
    
    private String program;
    private int year;
    private double fee;

    public Student(String program, int year, double fee, String name, Address address) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" + "program=" + program + ", year=" + year + ", fee=" + fee + " " +super.getAddress().toString()+ '}';
    }
    
    
}
