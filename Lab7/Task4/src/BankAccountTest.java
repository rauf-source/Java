/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class BankAccountTest {

    /**Scanner input  = new Scanner(System.in);
     * @param args the command line arguments
     */
          static Scanner input  = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
 
        BankAccount ba = new BankAccount("Savings", 0);   
        int flag=  1;
       while(flag == 1) {
            int n = inputInteger("1. Deposit\n2.Withdraw\n3.Show Current Balance")  ; 

             switch(n){
            case 1:
                ba.deposit(inputDouble("Deposit how much?"));
                break;
            case 2:
                ba.withdraw(inputDouble("Withdraw how much"));
                break;
            case 3:
                System.out.println("Current balance"+ ba.getBalance());
                break;
            default:
                flag = 0;
                break;
        }
       }
                }
 
    public static String inputString(String statement){
        System.out.println(statement);
        return input.nextLine();
    }
    
    public static double inputDouble(String statement){
        System.out.println(statement);
        return input.nextDouble();
    }
    public static int inputInteger(String statement){
         System.out.println(statement);
        return input.nextInt();
    }
    
    
}
