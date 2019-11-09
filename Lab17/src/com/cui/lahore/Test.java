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
for(int i =  0; i < 4; i++){
    int n = inputInteger("1 for circle\n2 for rectangle");
    if(shape[i] instanceof Circle && n == 1){
        Circle circle =  (Circle)shape[i];
        circle = new Circle(inputDouble("radius"), inputString("Color"), inputBoolean("Filled?"));
    }
    else if (shape[i] instanceof Rectangle && n==2){
        Rectangle rectangle  = (Rectangle)shape[i];
        rectangle = new Rectangle(inputDouble("width"), inputDouble("length"), inputString("color"),inputBoolean("Filed?") );
    }
    
//        switch(inputInteger("1: circle\n2: rectangle")){
//                case 1:
//              //double radius, String color, boolean filled
//                    shape[i] = new Circle(inputDouble("radius"), inputString("Color"), inputBoolean("Filled?"));
//                    System.out.println("area = " + shape[i].getArea() + "\nPerimeter " + shape[i].getPerimeter());
//                break;
//                case 2:
//                          //double width, double length, String color, boolean filled
//                    shape[i] = new Rectangle(inputDouble("width"), inputDouble("length"), inputString("color"),inputBoolean("Filed?") );
//                    System.out.println("area = " + shape[i].getArea() + "\nPerimeter " + shape[i].getPerimeter());
//                    
//                break;
//                default:
//                    System.out.println("you didn't enter a valid number");
//                       
//        }
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
        System.out.println("area = " + shape[i].getArea() + "\nPerimeter " + shape[i].getPerimeter());
}
    }
    
}
