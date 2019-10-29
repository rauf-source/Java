/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.lab.inheritance;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class CircleTest {

    /**
     * @param args the command line arguments
     */
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        Cylinder cylinder = new Cylinder(inputString("Color: "), inputInteger("Radius: "), inputInteger("Height: "));
            System.out.println("Volume of cylinder" + cylinder.calculateVolume());
            System.out.println("ARea of circle"+cylinder.calculateArea());

    }
    public static String inputString(String statement){
        System.out.println(statement);
        return input.nextLine();
    }
    
    public static int inputInteger(String statement){
        System.out.println(statement);
        return input.nextInt();
    }
    
}
