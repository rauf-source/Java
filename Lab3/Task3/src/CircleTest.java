/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class CircleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1 =  new Circle();
        c1.radius  = 3.50;
        System.out.println("Radius is "+ c1.radius);
        c1.calculateArea();
        c1.calculatePerimeter();
    }
    
}
