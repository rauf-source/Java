/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.technocrats.exceptionhandling;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter Y to divide by 0");
        String string =  input.nextLine();
        if(string.equals("Y") ){
            try{
                divideByZero(Math.random());
                System.out.println(2/0);
            }
        catch(ArithmeticException exp){
                System.out.println("Arthmetic Exception Caught");
                System.out.println(exp.getMessage());
                
        } 
        }
    }
    public static double divideByZero(double n){
        return n/0;
    }
}
