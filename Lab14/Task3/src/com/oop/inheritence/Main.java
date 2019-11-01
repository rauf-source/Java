/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//I took majority of this code from 9.4 section of the book as stated in the challenge
//copy paste other test methods here to test. Make sure to keep the same class name 
package com.oop.inheritence;

/**
 *
 * @author Admin
 */// Fig. 9.5: Main.java
 // CommissionEmployee class test program.

 public class Main
 {
 public static void main(String[] args)
 {
   BasePlusCommissionEmployee base1 =  new    BasePlusCommissionEmployee(25000, 0.4, 300, "Bob", "Lewis", "333-33-3333");
   BasePlusCommissionEmployee base2 =  new    BasePlusCommissionEmployee(208800, 0.4, 300, "Sanya", "Lewis", "333-33-3333");
   BasePlusCommissionEmployee base3 =  new    BasePlusCommissionEmployee(44500, 0.4, 300, "Rose", "Lewis", "333-33-3333");
   
   CommissionEmployee com1 =  new CommissionEmployee( 1000333, .62,"Rauf", "Jones", "222-22-2222");
   CommissionEmployee com2 =  new CommissionEmployee( 22500, .63,"Danny", "Jones", "222-22-2222");
   CommissionEmployee com3 =  new CommissionEmployee( 30300, .944,"Marina", "Jones", "222-22-2222");

    System.out.println(base1.getFirstName() + " " + base1.calculateBonus() );
    System.out.println(base2.getFirstName() + " " + base2.calculateBonus() );
    System.out.println(base3.getFirstName() + " " + base3.calculateBonus() );
    System.out.println(com1.getFirstName() + " " + com1.calculateBonus() );     
    System.out.println(com2.getFirstName() + " " + com2.calculateBonus() );
    System.out.println(com3.getFirstName() + " " + com3.calculateBonus() );
                         
                    
   
 } 
 }