/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.technocrats;

/**
 *
 * @author SP19-BSE-043
 */

 public class Triangle {
private double side1, side2, side3;

public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {

if(side1 > side2+side3){
    throw new IllegalTriangleException("IllegalTriangle Exception");
}
else if(side2 > side1 +side3){
       throw new IllegalTriangleException("IllegalTriangle Exception");
}
else if(side2 > side1 + side3){
        throw new IllegalTriangleException("IllegalTriangle Exception");

}
}

public double getSide1() {
return side1;
}
public void setSide1(double side1) {
this.side1 = side1;
}

public double getSide2() {
return side2;
}

public void setSide2(double side2) {
this.side2 = side2;
}

public double getSide3() {
return side3;
}

public void setSide3(double side3) {
this.side3 = side3;
}

@Override
public String toString() {
return "Triangle [getSide1()=" + getSide1() + ", getSide2()=" + getSide2() + ", getSide3()=" + getSide3() + "]";
}
}

   

