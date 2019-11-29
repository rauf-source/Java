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
public class Authors{
    //authorname,authorGender
    private String authorName;
    private boolean authorGender;
//true is male
    
    
    public Authors(String authorName, boolean authorGender) {
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
