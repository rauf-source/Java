/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
/*
Write a class Circle, which will model the functionality of a Circle. 
1.	Attributes
	radius
2.	Methods
	calculateArea(): To compute area 
	calculatePerimeter(): To compute perimeter

*/
public class Circle {
public double radius;

public void calculateArea(){
System.out.println("Area of the circle is : " + (Math.PI * Math.pow(radius, 2.000000)) );    
}
public void calculatePerimeter(){
    System.out.println("Perimter: " + (2 * Math.PI * radius ));
}


}
