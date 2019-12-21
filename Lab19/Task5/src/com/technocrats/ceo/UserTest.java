/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.technocrats.ceo;

/**
 *
 * @author Admin
 */
import java.util.*;
public class UserTest {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner (System.in);
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        //ask the amount of users and input them first
        ArrayList<User> users = new ArrayList<User>();
        //int id, String name, boolean status
        //ArrayList<User> users
        InMemoryUserService usersInMemory = new InMemoryUserService(users);
        /*
        void addUser(User user) throws UserAlreadyExistException; done
void updateUser(User user);
void deleteUser(int userID);
User getUser(int userID) throws UserAccountIsBlockedException;
void unblockUser(int userID);
void blockUser(int userID);
        */
        
      int flag = 1;
      while(flag == 1){
        int n = inputInteger("1. Add  User\n2.Update User\n3.DeleteUser\n4.UnBlock User\n5.Block User\n6.Display all the users\n7. Get User (handles checked exp)");
        switch(n){
           case 1:
           usersInMemory.addUser(returnPopulatedUser());
             break;
            case 2:
           usersInMemory.updateUser(returnPopulatedUser());
                break;
            case 3:
            usersInMemory.deleteUser(inputInteger("ID of the User: "));
                break;
            case 4:
            usersInMemory.unblockUser(inputInteger("ID of the User: "));
                break;
            case 5:
            usersInMemory.blockUser(inputInteger("ID of the User: ") );
                break;
            case 6:
                usersInMemory.displayAllUsers();
                break;
            case 7:
                try{
                    User u = usersInMemory.getUser(inputInteger("User Id"));
                    System.out.println(u.toString());
                }
                catch(UserAccountIsBlockedException exp){
                    System.out.println("USER ACCOUNT IS BLOCKED");
                }
                
                break;
            default:
                flag =2;
                break;
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
public static User returnPopulatedUser(){
    User u = new User(inputInteger("Id: "), inputString("Name: "), inputBoolean("Is User Active?"));

    return u;
}
    
    
}
