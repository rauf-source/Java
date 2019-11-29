/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.technocrats.developers;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Test {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner (System.in);
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Payable> payable = new ArrayList<Payable>();
        
        for(int i = 0; i < 2; i++){
            //salaried employee
            System.out.println("Give me the data of a salaried employee\n");
            //double weeklySalary, String firstName, String lastName, String socialSecurityNumber
            payable.add(new SalariedEmployee(inputDouble("WeeklySalary"),inputString("FirstName"),inputString("LastName"),inputString("SocialSecurityNumber") ));
            //String partNumber, String partDescription, int quantity, double pricePerItem
            System.out.println("Give me the data of Invoice\n");
            payable.add(new Invoice(inputString("PartNumber"), inputString("Part Description"), inputInteger("Quantity"), inputDouble("Price Per Item")));
    }
        
        System.out.println("Invoice Data");
        for(Payable p : payable){
            if(p instanceof Invoice){
                Invoice inv = (Invoice)p;
               System.out.println(inv.toString());
                System.out.println(inv.getPayableAmount());
            }
        }
        System.out.println("Salaried employee Data"); 
        for(Payable p : payable){
            if(p instanceof SalariedEmployee){
                SalariedEmployee sE = (SalariedEmployee)p;
                System.out.println(sE.toString());
                System.out.println(sE.getPayableAmount());
            }
        }
   }
    
public static int inputInteger(String statement){
	System.out.print(statement + ": ");
	return input.nextInt();
}
public static double inputDouble(String statement){
	System.out.print(statement + ": ");
	return input.nextInt();
}
public static String inputString(String statement){
	System.out.print(statement + ": ");
	return scanner.nextLine();
}
public static boolean inputBoolean(String statement){
	System.out.print(statement + ": ");
	System.out.print("1 for true/ any thing else for false");
	return input.nextInt() == 1? true: false;
}
}
