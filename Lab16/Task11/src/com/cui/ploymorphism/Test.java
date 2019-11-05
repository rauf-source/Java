/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.ploymorphism;

/**
 *
 * @author sp19-bse-043
 */
import java.util.Scanner;
public class Test {

    /**
     * @param args the command line arguments
     */
    static Scanner input =  new Scanner(System.in);
    static Scanner scanner =  new Scanner(System.in);
  
    public static void main(String[] args) {
        // TODO code application logic here
        Faculty[] faculty =  new Faculty[inputInteger("Size of faculty")];
        for(int i  = 0; i < faculty.length; i++){
        switch(inputInteger("1 for permanent 2 for visiting")){
            //double salary, int id, String nam
            case 1:
            faculty[i] =  new PermanentFaculty(inputDouble("salary"), inputInteger("id"), inputString("name"));
            break;
            case 2:
            faculty[i] =  new VisitingFaculty(inputDouble("Hours"),inputDouble("SalaryPerHr"), inputInteger("id"), inputString("name"));
//double hours, double salaryPerHr, int id, String name
             break;
            default:
                
        }
        }
        for(Faculty fac:  faculty){
            System.out.println(fac.calculateSalary());
        }
        
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
}
