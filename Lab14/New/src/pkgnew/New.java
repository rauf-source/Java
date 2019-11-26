/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

import java.util.*;

/**
 *
 * @author Admin
 */
public class New {

    /**
     * @param args the command line arguments
     */
  static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        System.out.println("Please input a number x");
     
        try{
               x =  input.nextInt();
        } catch (InputMismatchException e){
            x= 0;
        }
        System.out.println("x is " + x);
    

    }
}

    

