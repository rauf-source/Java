/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.lab.inheritence;

/**
 *
 * @author admin
 */
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }
    
     public double calculateArea(){
        return width * length;
    }
    public double calculatePerimeter(){
        return 2*(length + width);
    }
    
}
