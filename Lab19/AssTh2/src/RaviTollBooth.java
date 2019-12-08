
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class RaviTollBooth extends TollBooth {

    public RaviTollBooth(ArrayList<Truck> trucks) {
        super(trucks);
    }

   
    /*
    TollBooth should contain a method double calculateToll(Truck truck) that should be overridden by
RaviTollBooth and IslamabadTollBooth to calculate toll using above mentioned rules for each booth.
    */
    /*
    
    . For example, trucks passing through a Ravi
Toll Booth are required to pay a toll of PKR 5 per axle plus PKR 10 per half-ton of the loaded weight if its
less than 30 ton and PKR 5 per half-ton for the weight above 30 tons. Trucks passing through Islamabad
Toll Booth are required to pay PKR 8 per axle and PKR 12 per half-ton. You will design an object oriented
program in Java that simulates the operation of the both tollbooths and different types of trucks.
    */
    
    public double calculateToll(Truck truck){
        //deal with it later, simple logic     
        //update totalToll here
        final double weight = truck.getWeight() /1000;
        double pkr = truck.getAxles()*5;
        //10 per half ton , 20 per ton if w < 30
        pkr+= weight < 30 ? weight * 20 : weight*10;
        return pkr;
    }
     public void arrived (Truck truck){
         
         /*
         When a truck arrives, this method shall be called to
print the truck info using displayData method, it shall also display the toll due for that truck using
calculateToll method of toll booth. 
         */
         truck.displayData();
         System.out.println(" Total due: PKR <"+ calculateToll(truck)+">");
     }
    
}
