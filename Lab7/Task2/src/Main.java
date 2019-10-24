/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Main {
        static Scanner input = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 //user name, ID, semester, section, GPA, CGPA and marks in Programming Fundamentals.
        
    String name =  inputString("What is your name");
    String section = inputString("What is your section");
    double gpa = inputDouble("What is your gpa");
    double cgpa =  inputDouble("What is your cgpa");
    int marks  = inputInteger("Marks in programming funadamentals");
    
    
    System.out.println(name + " " + section + " " + gpa  + " " + cgpa + " " +marks );
    
    }
    public static String inputString(String statement){
        
        System.out.println(statement);
        return input.nextLine();
    }
     public static int inputInteger(String statement){
        System.out.println(statement);
        return input.nextInt();
    }

    public static double inputDouble(String statement){
        System.out.println(statement);
        return input.nextDouble();
    }
    
}
