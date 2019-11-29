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
ArrayList<Issuable> issuable =  new ArrayList<Issuable>();
while(flag1){
    System.out.println("Borrower :1 , AutoBiography:2, Exit : 3");

  

    switch(input.nextInt()){
        case 1  :
            issuable.add(new Borrower(inputInteger("Borrower ID"), inputString("Borrower Name")));
            break;
        case 2:
            //String personName, double bookPrice, Authors[] authors, String bookName
            //String authorName, boolean authorGender, double bookPrice, Authors[] authors, String bookName
            Double bookPrice = inputDouble("Book Price: ");
            String bookName = inputString("Book Name");
            issuable.add(new Autobiography(inputString("Person Name "),
                   bookPrice,
                    inputAuthors("Input Authro data"),
                    bookName));
            break;
        case 3: 
            flag1=  false;
            break;
        default:
            break;
    }
    //point 3
    
    
}
if(issuable.size() >= 2){
        issuable.remove(issuable.size() -1);
    }
    for(int i = 0; i < issuable.size(); i++){
        if(issuable.get(i).issue()== true){
            System.out.println("Issue Succesfull");
        }
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
     public static boolean inputBoolean(String statement){
        System.out.println(statement);
        int n =  input.nextInt();
        if(n == 1){
            return true;
        }
        
        else {
            return false;
        }
    }   
 public static Authors[] inputAuthors(String statement){
     System.out.println("How many Authors?");
    int n =  input.nextInt();
    
     Authors[] authors = new Authors[n] ;
     
   //double bookPrice, Authors[] authors, String bookName
     //save authors data into another array then at the end merge it with the one to be returned
     //The question didn't make any sense so I had to have a little twist
 for(int i =0; i < authors.length; i++){
     
     authors[i] = new Authors(inputString("Author Name"), inputBoolean("1 for Male, 2 or anyother number for Female"));
 }
 return authors;
 }
}
