/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.lab.inheritence;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class CircleTest {

    /**
     * @param args the command line arguments
     */
    static Scanner input =  new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Circle");
        Circle c1 = new Circle(inputDouble("radius"),inputString("color") );
        System.out.println("Area " + c1.calculateArea());
        System.out.println("Perimter" + c1.calculatePerimeter() );
    
        System.out.println("Rectangle");
        Rectangle r1 =  new Rectangle(inputDouble("width"), inputDouble("length"), inputString("Color"));
     
        System.out.println("Area " + r1.calculateArea());
        System.out.println("Perimter" + r1.calculatePerimeter() );
    }
      public static String inputString(String statement){
        System.out.println(statement);
        return input.nextLine();
    }
    
    public static double inputDouble(String statement){
        System.out.println(statement);
        return input.nextDouble();
    }
    
}
