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
public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

//getArea and getPerimeter
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }
//    @Override
//    public String toString() {
//        return super.toString()+"Recatngle{" + "width=" + width + ", length=" + length + '}';
//    }
//    
//       
}