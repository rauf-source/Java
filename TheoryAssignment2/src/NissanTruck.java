/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class NissanTruck extends Truck {

    public NissanTruck(int axles, double weight) {
        super(axles, weight);
    }
    /*
    Each Truck shall store its number of axles and loaded weight. It shall allow others to read both
attributes but not change them. Each truck should have displayData method that shall be overridden by
each type of truck. It shall print the make, total axles and loaded weight. E.g. Ford Truck Axles: 5
 Total weight KG: 12500

    */
    public void displayData(){
        System.out.println("Nissan Truck Axles: " + super.getAxles() + " Total Weight KG: " + super.getWeight());
    }
}
