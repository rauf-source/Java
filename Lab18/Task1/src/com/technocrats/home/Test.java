/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.technocrats.home;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Test {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
    Date date = new Date(inputInteger("Day"),inputInteger("Month" ),inputInteger("Year" ));//d/m/y
    Time time = new Time(inputInteger("Seconds"),inputInteger("Minutes"),inputInteger("Hours"));//s/m/h
    
        System.out.println("DateFormat D/M/Y | TimeFormat: h/m/s");
    for(int i = 0 ; i < 10;i++){
        Ticker dateTime = date;
            dateTime.Tick();
        dateTime =  time;
            dateTime.Tick();
            System.out.printf("%d/%d/%d\n",date.getDay(), date.getMonth(), date.getYear());
            System.out.printf("%02d:%02d:%02d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        }
    }
 public static int inputInteger(String statement){
	System.out.print(statement + ": ");
	return input.nextInt();
}
public static double inputDouble(String statement){
	System.out.print(statement + ": ");
	return input.nextDouble();
}
public static String inputString(String statement){
	System.out.print(statement + ": ");
	return scanner.nextLine();
}
public static  boolean inputBoolean(String statement){
	System.out.print(statement + ": ");
	System.out.print("1 for true/ any thing else for false");
	return input.nextInt() == 1? true:false;
}   
}
