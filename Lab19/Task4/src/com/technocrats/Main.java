/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.technocrats;

/**
 *
 * @author SP19-BSE-043
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        //SUM OF ANY TWO SIDES IS GREATER THAN THE TWO SIDE 
       try{
        Triangle triangle = new Triangle(input.nextInt(),input.nextInt(),input.nextInt());
           System.out.println("walalalalala");
       }catch(IllegalTriangleException exp){
           System.out.println(exp.getMessage());
       }
    }
    
}
