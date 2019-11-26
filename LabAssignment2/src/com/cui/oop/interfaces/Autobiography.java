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

    public Autobiography(String personName, double bookPrice, Authors[] authors, String bookName) {
        super(bookPrice, authors, bookName);
        this.personName = personName;
    }
     public boolean issue(){
         return true;
     }

    @Override
    public String toString() {
        return "Autobiography{" + "personName=" + personName + '}';
    }
    
     
     
}
