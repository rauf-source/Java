
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
public class IslamabadTollBooth extends TollBooth{

    public IslamabadTollBooth(ArrayList<Truck> trucks) {
        super(trucks);
    }
    
    /*
    Trucks passing through Islamabad
Toll Booth are required to pay PKR 8 per axle and PKR 12 per half-ton. 
    */
 public double calculateToll(Truck truck){
        //deal with it later, simple logic
     //Mt = Mkg / 1000
     final double weight = truck.getWeight() /1000;
        double pkr = truck.getAxles()*8;
        //10 per half ton , 20 per ton if w < 30
        pkr+= weight*24 ;
        return pkr;
    }
     public void arrived (Truck truck){
         
         
     }
}
