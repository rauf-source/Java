/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.departments.cs.program.batch;

/**
 *
 * @author Admin
 */
public class Course {
    private int code;
    private String title;
    private int credits;

    public Course(int code, String title, int credits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
    }

    
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
}
