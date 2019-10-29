/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.lab.inheritence;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Test {
static Scanner input = new Scanner(System.in);
static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student(inputString("program"), inputInteger("year"), inputDouble("Fee"), inputString("name"), new Address(inputString("city") ,inputString("country")) );
//        /String program, int year, double fee, String name, Address address
        Staff staff= new Staff(inputDouble("Pay"), inputString("name"),  new Address(inputString("city") ,inputString("country")) );
        //double pay, String name, Address address
        System.out.println(s1.toString());
        System.out.println(staff.toString());
    }
    public static double inputDouble(String statement){
        System.out.println(statement);
        return input.nextDouble();
    }
    
    public static int inputInteger(String statement){
        System.out.println(statement);
        return input.nextInt();
    }
    public static String inputString(String statement){
        System.out.println(statement);
        return scanner.nextLine();
    }
    
    
}
