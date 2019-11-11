/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.lahore;

/**
 *
 * @author sp19-bse-043
 */
import java.util.Scanner;
public class Test {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
//1.Create an array of shapes of 4 elements.
        Shape [] shape = new Shape[4];
//2.Initialize array with elements of different sub-classes (rectangle, circle).
        shape[0] =  new Rectangle(1,1,"Red", true);
        shape[1] =  new Circle(2,"Black", false);
        shape[2] = new Rectangle(3,3, "Orange", true);
        shape[3] = new Circle(4, "Gray", false);

        System.out.println("What you want to edit");
    //3.	Show the user a menu, which shape’s data he wants to change (circle:1, or rectangle:2). 
        
      
            int n = inputInteger("1 for circle and 2 for rectangle");
            //o	Input shape data from user (length, width in case of rectangle, and radius in case of circle)
            if(n ==1 ){
               double radius = inputDouble("radius :");


                for(int j = 0 ; j < shape.length ;j++){
                   if(shape[j] instanceof Circle){
                       Circle c =  (Circle)shape[j];
                       c.setRadius(radius);
                    
                   }
                  
                }
            }
            else{
                double length = inputDouble("length");
                double width =  inputDouble("width");
                 for(int j = 0 ; j < shape.length ;j++){
                   if(shape[j] instanceof Rectangle){
                       Rectangle r =  (Rectangle)shape[j];
                       r.setLength(length);
                       r.setWidth(width);
                 
                   }
                   
            }
        
        }
    
shapesSummary(shape);

    }
    public static int inputInteger(String statement){
        System.out.println(statement);
        return input.nextInt();
    }
    
    public static String inputString(String statement){
        System.out.println(statement);
        return scanner.nextLine();
    }
    
    public static double inputDouble(String statement){
        System.out.println(statement);
        return input.nextDouble();
    }
    public static boolean inputBoolean(String statement){
      System.out.println(statement);
        System.out.println("1 for true anything else for false");
        if(input.nextInt()== 1){
            return true;
        }
        else{
            return false;
        } 
 
    }
  
    public static void shapesSummary(Shape [] shape){
for(int i  = 0; i < shape.length; i++){  
    
    if(shape[i] instanceof Rectangle){
        System.out.println("\nrectangle data");
         System.out.println("area = " + shape[i].getArea() + "\nPerimeter " + shape[i].getPerimeter());
         
         System.out.println(shape[i].toString() + "\n");
    }
    else {
        System.out.println("circle data");
         System.out.println("area = " + shape[i].getArea() + "\nPerimeter " + shape[i].getPerimeter());
         System.out.println(shape[i].toString() + "\n");
    }
   
}

    }
    
}
