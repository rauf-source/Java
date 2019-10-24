/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class RectangleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Rectangle r1 =  new Rectangle();
       r1.length =   4;
       r1.width = 2;
        System.out.println("length: "+ r1.length + "\nwidth: " + r1.width);
        r1.calculateArea();
        r1.caclculatePerimeter();
    }
    
}
