/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.oop.interfaces;

/**
 *
 * @author admin
 */
import java.util.*;
public class TestSessional {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner (System.in);
    static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        // TODO code application logic here
//         //I.	Show the user a menu,
//         which repeatedly asks data he wants to input
//                 (Borrower:1, or Autobiography:2, Exit: 3). 
//                 Note that this loop ends when user inputs value 3.
 

boolean flag1 =true;
while(flag1){
    System.out.println("Borrower :1 , AutoBiography:2, Exit : 3");

    ArrayList<Issuable> issuable =  new ArrayList<Issuable>();

    switch(input.nextInt()){
        case 1  :
            issuable.add(new Borrower(inputInteger("Borrower ID"), inputString("Borrower Name")));
            break;
        case 2:
            //String personName, double bookPrice, Authors[] authors, String bookName
            //String authorName, boolean authorGender, double bookPrice, Authors[] authors, String bookName
            issuable.add(new Autobiography(inputString("Person Name"), inputDouble("BookPrice"), ))
            break;
        case 3: 
            flag1=  false;
            break;
        default:
            break;
    }
}
    }
 public static int inputInteger(String statement){
        System.out.println(statement);
        return input.nextInt();
    }   
  public static String inputString(String statement){
        System.out.println(statement);
        return input.nextLine();
    }   
    public static double inputDouble(String statement){
        System.out.println(statement);
        return input.nextDouble();
    }   
 public static void function2 (){
     
 }
}
