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
public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    
     public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
    
    
}
