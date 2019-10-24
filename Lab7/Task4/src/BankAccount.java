/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class BankAccount {
////    
//// balance and name attributes of type double and String. 
//    
//    Define public void deposi t(double amount) and public void withdraw(double amount) methods.
//            Deposit should increase the balance by passed value and withdraw should decrease the balance with passed amount.
////
////Make BankAccountTest class. In main method, create a new object of BankAccount class.
//            Get balance and name of account holder from user input and initilize both object attributes. 
//            Then show this menu:
////
////Press 1: To Deposit an amount
////Press 2: To Withdraw an amount
////Press 3: To View the current balance
////
////If user press 1: show following: 
////Enter the amount you want to desposit in your account >
////For example. If user enters 500, call the desposit method of BankAccount object and pass 500 to it.
//            Do it for option 2 but call the withdraw method. If user choose 3 from menu, print the current balance.
////    
    
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    
    
    
    
    
    public void deposit(double amount){
        balance+= amount;
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Not enough funds, nothing withdrawn");
            
        }
        else{
            balance -= amount;
        }
    }
    
    
}
