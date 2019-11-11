/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

import java.util.*;

/**
 *
 * @author Admin
 */
public class New {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
       int arr[][] = new int[3][3];
       for(int i = 0; i < arr.length ;i++){
           for(int j = 0; j < arr.length; j++){
               arr[i][j] = (int) Math.floor(Math.random() * 10);
           }
        
    }
         for(int i = 0; i < arr.length ;i++){
           for(int j = 0; j < arr.length; j++){
               System.out.print(arr[i][j] + " ");
           }
             System.out.println();
        
    }
      
       
        System.out.println(diagonalDifference(arr));
    }
      public static int diagonalDifference(int[][] arr) {
    // Write your code here
// loop over each element, with increment of one
   int sum1 = 0;
   int sum2 = 0;
    for(int i  = 0; i < arr.length;i++){
        sum1+=arr[i][i];
    }
    int j = 0;
    for(int i  = arr.length - 1; i >=0; i--){
        sum2+= arr[i][j];
        j++;
    }
    return Math.abs(sum1-sum2);

    }

}

    

