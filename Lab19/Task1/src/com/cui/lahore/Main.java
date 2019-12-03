/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.lahore;

/**
 *
 * @author SP19-BSE-043
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            System.out.println(3/0);    
               
        }
        catch(ArithmeticException exp2){
            System.out.println(exp2.getMessage ());
        }
    }
    
}
