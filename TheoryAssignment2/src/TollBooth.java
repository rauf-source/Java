/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public abstract class TollBooth {
  //The main behavior required of a tollbooth is the ability to calculate the toll due.
    /*
    Both TollBoth shall keep track of a) the total
number of trucks that have gone through it and b) total toll received
    */
    private double totalTollReceived;
    private int totalReceipt;//pkr
    private ArrayList<Truck> trucks;

    public TollBooth( ArrayList<Truck> trucks) {
        this.trucks = trucks;
        setTotalReceipt();
    }

  
    public int getTotalReceipts() {
        return totalReceipt;
    }

    public ArrayList<Truck> getTrucks() {
        return trucks;
    }

    public double getTotalTollReceived() {
        return totalTollReceived;
    }
    private void setTotalReceipt(){
    
        totalReceipt =0;
        for(Truck truck : trucks){
            totalReceipt+=  calculateToll(truck);
        }
    }
    //myMethods 
    /*
    4. When displayData method of TollBooth is called, it shall print the total number of trucks passed
through it and total toll received. E.g. Total Trucks Arrived: 5 Total Receipt: PKR 54000
    */
    public void displayData(){
        System.out.println("Total Trucks Arrived: " + trucks.size() + "Total Receipt: PKR " + totalReceipt);
    }
    
    /*
    TollBooth should contain a method double calculateToll(Truck truck) that should be overridden by
RaviTollBooth and IslamabadTollBooth to calculate toll using above mentioned rules for each booth.
    */
    public abstract double calculateToll(Truck truck);
    public abstract void arrived(Truck truck);
}
