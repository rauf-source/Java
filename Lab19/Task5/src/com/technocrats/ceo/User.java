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
public class User {
    /*
    Define at least id, name, and status instance attributes in User class of type int,
    String and Boolean. How you check whether a user account is blocked? If status attribute is false, 
    it means user account is blocked. True represent the account is active.
    */
    private int id;
    private String name;
    private boolean status; //false means blocked, true means active

    public User(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", status=" + status + '}';
    }
    
    
    
}
