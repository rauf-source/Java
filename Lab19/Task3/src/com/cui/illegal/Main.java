/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.illegal;

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
        int arr[] =  new int[4];
    arr[0] = 02;
    arr[1] = 24;
    arr[2] =23;
    arr[3] =23;
        try{
            arr[4] = 24;
            
        }catch(IndexOutOfBoundsException exp){
            System.out.println(exp.getMessage() + "errororr");
        }
    }
    
}
