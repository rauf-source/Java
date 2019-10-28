/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raufsource;
public enum Book{
    JHTP("Java How to Program", 2010),
    CHTP("C How to program", 2011),
    CPPHTP("C++ how to program", 2011),
    VBHTP("Visual Basic how to program", 2013);
    
    private String title;
    private int year;
   private Book(String title, int year){
        this.title =  title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
    
}