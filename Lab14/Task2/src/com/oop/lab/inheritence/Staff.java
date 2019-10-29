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
public class Staff extends Person{
    private double pay;

    public Staff(double pay, String name, Address address) {
        super(name, address);
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" + "pay=" + pay + " " + super.getAddress().toString() + '}';
    }
    
}
