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
public class UserAccountIsBlockedException extends Exception {

    /**
     * Creates a new instance of <code>UserAccountIsBlockedException</code>
     * without detail message.
     */
    public UserAccountIsBlockedException() {
    }

    /**
     * Constructs an instance of <code>UserAccountIsBlockedException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public UserAccountIsBlockedException(String msg) {
        super(msg);
    }
}
