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
public class InMemoryUserService implements UserService{
    //. Use ArrayList for storage, update and retrieve operations inside InMemoryUserServic
    private ArrayList<User> users;

    public InMemoryUserService(ArrayList<User> users) {
        this.users = users;
    }
   
    
    @Override
    public void addUser(User user) throws UserAlreadyExistException {
        int flag = 0;
        for(User u: users){
            if(user.equals(u)){
                flag++;
                throw new UserAlreadyExistException("UserALreadyExistException" +  user.getId());
            }
        }
        if(flag== 0){
            users.add(user);
        }
    }

    @Override
    public void updateUser(User user) {
        //if id exists edit, if it doesnt. do nothing
        
     
        if(indexOfUser(user) != -1){
            users.set(indexOfUser(user), user);
        }
        else{
            System.out.println("USER DOESN'T EXIST");
        }
        
    }

    @Override
    public void deleteUser(int userID) {
        int index= indexOfUser(userID);
        if(index != -1){
            users.remove(index);
        }
        
        
    }

    @Override
    public User getUser(int userID) throws UserAccountIsBlockedException{
        //first search for the user with that user Id
        for(int i = 0; i < users.size();i++){
            if(users.get(i).getId() == userID){
                if(!users.get(i).isStatus()){
                    throw new UserAccountIsBlockedException("UserAccountIsBlockedException");
                }
             return users.get(i);
            }
        }
        //if we don't find any user it has to return null
        return null;
    }

    @Override
    public void unblockUser(int userID) {
        
         int index= indexOfUser(userID);
        if(index != -1){
          users.get(index).setStatus(true);
        }
        else {
            System.out.println("User doens't exist");
        }
        
    }

    @Override
    public void blockUser(int userID) {
              int index= indexOfUser(userID);
        if(index != -1){
          users.get(index).setStatus(false);
        }
        else {
            System.out.println("User doens't exist");
        }
    }

    @Override
    public ArrayList getAllUser() {
        return users;
    }
    public void displayAllUsers (){
        //id name status
        System.out.println(users.size());
        for(User u: users){
        System.out.println("Id: "+u.getId());
        System.out.println("Name: "+u.getName());
        System.out.println("Status: " +( u.isStatus() == true ? "Active": "Blocked"));
    }
    }
    private int indexOfUser(User user){
        
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getId() == user.getId()){
                 return i;
            }
           
    }
        return -1;
   
}
    private int indexOfUser(int userId){
        
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getId() == userId){
                 return i;
            }
           
    }
        return -1;
   
}
     /*
    Use ArrayList for storage, update and retrieve operations inside InMemoryUserService.
    Test all methods from UserTest class. Getting info from user input is encouraged but optional. 
    */
    
}
