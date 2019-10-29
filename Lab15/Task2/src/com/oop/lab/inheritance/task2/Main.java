/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.lab.inheritance.task2;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
   static Scanner input =  new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        Cylinder c1 = new Cylinder(inputString("Color"), inputDouble("radius"), inputDouble("height"));
    }
    public static double inputDouble(String statement){
        System.out.println(statement);
        return input.nextDouble();
    }
    public static String inputString(String statement){
        System.out.println(statement);
        return input.nextLine();
    }
}
