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
public class Date implements Ticker{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }
     public void Tick(){
         //greater equal is better than equals. If user enters greater than 30 it would still work and for the max value. Can't exceed 30 anyway
         if(day >= 30){
             day = 1;
             if(month >= 12){
                 month = 1;
                 year++;
             }
             else {
                 month++;
             }
         }
         else {
             day++;
         }
     }
}
