/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.lahore;

/**
 *
 * @author sp19-bse-043
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

       

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //getarea+getPerimeter
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI* radius;
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Circle{" + "radius=" + radius + '}';
    }


    
    
}