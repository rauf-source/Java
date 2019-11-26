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
public class Borrower implements Issuable{
    private int borrowerId;
    private String borrowerName;

    public Borrower(int borrowerId, String borrowerName) {
        this.borrowerId = borrowerId;
        this.borrowerName = borrowerName;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    @Override
    public boolean issue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
  //make the issue method
    @Override
    public String toString() {
        return "Borrower{" + "borrowerId=" + borrowerId + ", borrowerName=" + borrowerName + '}';
    }
    
}
