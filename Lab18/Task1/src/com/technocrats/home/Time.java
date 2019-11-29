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
public class Time implements Ticker{
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Time{" + "seconds=" + seconds + ", minutes=" + minutes + ", hours=" + hours + '}';
    }
////    Increment in seconds and if second is equal to 60 rest it 0 and incremnt in minutes.
//    If minutes is equal to 60 rest minutes to 0 and increment in hours.
//    If hours is equal to 24 rest it to 0.
    public void Tick(){
  if(seconds >= 59){
      seconds = 0;
        if(minutes >= 59){
            minutes = 0;
                if(hours >= 23){
                    hours  = 0;
                }
                else {
                    hours++;
                }
        }
        else {
            minutes++;
        }
  }
  else {
      seconds++;
  }
 
    
}
    
}
