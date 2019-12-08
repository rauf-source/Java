/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class DaewooTruck extends Truck{

    public DaewooTruck(int axles, double weight) {
        super(axles, weight);
    }
    
    
    
       public void displayData(){
        System.out.print("Daewoo Truck \tAxles: " + super.getAxles() + " Total Weight KG: " + super.getWeight());
    }
}
