/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public abstract class Truck {
      /*
    attributes = {
    -axles : int,
    -weight: double
    }
    */
     private int axles;
    private double weight;

    public Truck(int axles, double weight) {
        this.axles = axles;
        this.weight = weight;
    }
   
    public int getAxles() {
        return axles;
    }

    public double getWeight() {
        return weight;
    }
    public abstract void displayData();
    
}
