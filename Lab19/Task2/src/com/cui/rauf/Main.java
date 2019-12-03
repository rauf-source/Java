/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.rauf;

/**
 *
 * @author SP19-BSE-043
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = null;
        try{
            scanner.nextLine();
            System.out.println(2/0);
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage() + " excecption");
        }
        catch(ArithmeticException exp){
            System.out.println(exp.getMessage());
        }
    }
    
}
