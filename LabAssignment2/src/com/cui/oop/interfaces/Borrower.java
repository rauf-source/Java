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
        for(int i = 0; i < 20; i++){
            System.out.print("-");
        }
        System.out.println("|  ID : " +  borrowerId + "   |");
        System.out.println("|  Name : " +  borrowerId + "   |");

        for(int i = 0; i < 20; i++){
            System.out.print("-");
        }        
        return true;
    }
   
    
  //make the issue method
    @Override
    public String toString() {
        return "Borrower{" + "borrowerId=" + borrowerId + ", borrowerName=" + borrowerName + '}';
    }
    
}
