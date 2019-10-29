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
import java.util.Scanner;
public class Test {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
       BasePlusCommission bps = new BasePlusCommission(inputDouble("BaseSalary: "), inputString("FirstName"), inputString("LastName"), inputDouble("Gross Sales"), inputDouble("CommissionRate"));
        System.out.println("Earnings " + bps.earnings());
        System.out.println(bps.toString());
    
    
    }
    public static double inputDouble(String statement){
        System.out.println(statement);
        return input.nextDouble();
    }
    
    public static String inputString(String statement){
        System.out.println(statement);
        return scanner.nextLine();
    }
}
