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
    //computeAuthorLoyalty
//    public abstract double computeAuthorLoyalty();
    
    
}
