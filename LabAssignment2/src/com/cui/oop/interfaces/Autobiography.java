/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.oop.interfaces;

/**
 *
 * @author Admin
 */
public class Autobiography extends Book {
    private String personName;
     private Authors authors[];
    public Autobiography(String personName, double bookPrice, Authors[] authors, String bookName) {
        super(bookPrice, authors, bookName);
        this.personName = personName;
    }
    
    /*
i.	issue() method in Autobiography returns true 
    if the price of book is greater than 1000/-PKR and the book has more than 2 authors. Otherwise, 
    it displays an error message “Invalid issue operation.”, and returns false
   */
     public boolean issue(){
         if( getBookPrice() > 1000 && getAuthors().length > 2){
             return true;
         }
         else{
             System.out.println("Invalid ISsue operation");
             return false;
         }
         }
     public double computePersonLoyalty(){
         return getBookPrice() *  10/100; 
     }
    @Override
    public String toString() {
        return "Autobiography{" + "personName=" + personName + '}';
    }
    
     
     
}
