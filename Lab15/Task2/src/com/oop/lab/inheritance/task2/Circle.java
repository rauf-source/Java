/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.lab.inheritance.task2;

/**
 *
 * @author admin
 */
public class Circle {
    private String color;
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }
    
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
    
}
