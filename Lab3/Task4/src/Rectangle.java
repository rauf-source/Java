/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Rectangle {
    public double length;
    public double width;
    
    public void calculateArea(){
        
        System.out.println("Area: " + length * width);
    }
    public void caclculatePerimeter(){
        
        System.out.println("Perimeter: " +  2*(length + width));
        
        
    }
}
