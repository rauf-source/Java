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
public class Authors extends Book{
    //authorname,authorGender
    private String authorName;
    private boolean authorGender;
//true is male
    public Authors(double bookPrice, Authors[] authors, String bookName) {
        super(bookPrice, authors, bookName);
    }
    
   

    public Authors(String authorName, boolean authorGender, double bookPrice, Authors[] authors, String bookName) {
        super(bookPrice, authors, bookName);
        this.authorName = authorName;
        this.authorGender = authorGender;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean isAuthorGender() {
        return authorGender;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorGender(boolean authorGender) {
        this.authorGender = authorGender;
    }
public boolean issue(){
    return true;
}
//    @Override
//    public double computeAuthorLoyalty() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
   
}
