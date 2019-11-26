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
public abstract class Book implements Issuable {
    private double bookPrice;
    private Authors authors[];
    private String bookName;

    public Book(double bookPrice, Authors[] authors, String bookName) {
        this.bookPrice = bookPrice;
        this.authors = authors;
        this.bookName = bookName;
    }    
    public double getBookPrice() {
        return bookPrice;
    }

    public Authors[] getAuthors() {
        return authors;
    }
    
    public abstract boolean issue();
    //ii.	computeAuthorLoyalty() method calculates total loyalty payable to authors using following rules\
    
    //computeAuthorLoyalty
    public  double computeAuthorLoyalty(){
//1000, 30% of it, 300, then divided by num of authors 
double loyalty =  bookPrice * (30/100) ; //300
double avg =  loyalty / authors.length; // 300/ num = 100 lets say its 3
for(int i = 0; i < authors.length; i++){
   
        avg += avg;//100 +100 + 100
     if(authors[1].isAuthorGender() == false){
            avg += 50; //300 + 100 if 2 f = 400
        }
    
}
 
        return avg;
    }
    
    
}
