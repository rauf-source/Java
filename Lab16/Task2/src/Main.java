/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp19-bse-043
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<Person> person  = new ArrayList<Person>();
       
    for(int i = 0; i < 2; i++){
    switch(inputInteger("1 for staff 2 for students")){
        case 1:
            //String school, double pay, String name, String address
            person.add( new Staff(inputString("Schhool"), inputDouble("pay"), inputString("Name"), inputString("Address")) );
                break;
        case 2:
            //String program, int year, double fee, String name, String address
            person.add(new Student (inputString("Program"), inputInteger("yuear"), inputDouble("fee"), inputString("name"), inputString("address")));
            break;
        default:
            System.out.println("Error code 124*64213 generated");
            break;
    }
    }
    for(Person p: person)
    {
        System.out.println(p);
    }
    
    
    }

     public static int inputInteger(String statement){
        System.out.println(statement);
        return input.nextInt();
    }

    public static String inputString(String statement){
        System.out.println(statement);
        return scanner.nextLine();
    }

    public static double inputDouble(String statement){
        System.out.println(statement);
        return input.nextDouble();
    }

}
