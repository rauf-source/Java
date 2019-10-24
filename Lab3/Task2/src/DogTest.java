/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class DogTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Dog d1 =  new Dog ();
    d1.name = "Rocky";
    d1.breed = "Boxer";
        System.out.println("Dog name: "+ d1.name);
        d1.sleep();
        System.out.println("Dog breed: "+ d1.breed);
        d1.speak();
        d1.eat();
               
                
        
    }
    
}
