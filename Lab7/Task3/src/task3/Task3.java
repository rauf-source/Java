/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner(System.in);
        
        //print the laregest in 3
        int num[] = new int[3];
        for(int i = 0 ; i< num.length;i++){
            num[i]=  input.nextInt();
        }
        //o(n)
        int max = num[0];
        for(int i = 0 ; i < num.length;i++){
           if(max < num[i]){
               max = num[i]; 
           }
        }
        
        System.out.println("The larget number" + max);
    }
    
}
