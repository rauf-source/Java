/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.inheritance;

/**
 *
 * @author Admin
 */
public class Employee {
  /*  //The common attributes and behaviors for all Employees are firstName,
    lastName, 
    socialSecurityNumber, 
    getFirstName, getLastName, 
  //  getSocialSecurityNumber and a portion of method toString
*/
    
    private String firstName;
    private String lastName;
    private int socialSecurityNumber;
//constructor

    public Employee(String firstName, String lastName, int socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    
    
    }
