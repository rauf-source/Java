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
public class TestTollBooth {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        
        
        the game plan :
        1.destructure the string input  (done)
        2. for all the inputs of 1 FOrd
        3. for 2 is Nissan and for 3 is Daewoo
        4. then save axles, weight and run for both if elses(define body) done theyare saved in the trucks aarray
        5. after the loop is done, then run the for loop for display and all other stuff
        */
        // TODO code application logic here
        /*
        let x = str.split(" ");
        x.match(/^/d+/);
        */
       
        
        ArrayList<Truck> trucks = new ArrayList<Truck>();
        
        String cin[] = input.nextLine().split(" ");
        for(int i = 0; i < cin.length; i++){
            //first check the type   
           if(cin[i].substring(0,1).equals("1")){
              //ford (axles, weight)
               trucks.add(new FordTruck(cutForAxles(cin[i]),cutForWeight(cin[i]) ));
           }
           else if(cin[i].substring(0,1).equals("2")){
              //Nissan
               trucks.add(new NissanTruck(cutForAxles(cin[i]),cutForWeight(cin[i]) ));

           }
           else if(cin[i].substring(0,1).equals("3")){
              //Daewoo
               trucks.add(new DaewooTruck(cutForAxles(cin[i]),cutForWeight(cin[i]) ));

           }
            
        }
       
           TollBooth boothRavi = new RaviTollBooth(trucks);
           TollBooth boothIslamabad = new IslamabadTollBooth(trucks);
         //call arrived function for booth on every truck object
           System.out.println("At Ravi Toll Booth");
           for(int i  =0; i < trucks.size() ; i++){
               boothRavi.arrived(trucks.get(i));
             
           }
           boothRavi.displayData();
            System.out.println("\nAt Islamabad Toll Booth");
           for(int i  =0; i < trucks.size() ; i++){
               boothIslamabad.arrived(trucks.get(i));
           }
            boothIslamabad.displayData();
        //fetch the substring midway in a loop
        
       
        
//           
        
//            Truck ford = new FordTruck(5, 12000); // 5 axles and 12000 kilograms
//            Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000kg 
//            ArrayList<Truck> trucks = new ArrayList<Truck>();
//            trucks.add(ford);
//            trucks.add(nissan);
//            TollBooth booth = new RaviTollBooth(trucks);
//            booth.arrived(ford);
//           booth.arrived(nissan);
//           booth.displayData(); 
           /*
           str.subString(0,1);
           regexx ?
           
           */
    }
    public static int cutForAxles(String str){
     int i = 2;
        while(i < str.length()){
           if(str.split("")[i].equals("-")){
               break;
           }
           i++;
       }
        return Integer.parseInt(str.substring(2,i));
    }
      public static int cutForWeight(String str){
     int i = 2;//1-23-232425
        while(i < str.length()){
           if(str.split("")[i].equals("-")){
               break;
           }
           i++;
       }
        return Integer.parseInt(str.substring((i+1)));
    }
    
}
