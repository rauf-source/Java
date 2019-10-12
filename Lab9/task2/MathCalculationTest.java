import java.util.Scanner;
public class MathCalculationTest{

public static void main(String args[]){


Scanner input =  new Scanner(System.in);

MathCalculation obj = new MathCalculation(3,5);

/*System.out.println("Please enter 2 numbers");
System.out.print("Number 1 :");
obj.setNumber1(input.nextInt());
System.out.print("Number 2 :");
obj.setNumber2(input.nextInt());
*/


System.out.println("Here are my five java.lang.Math class methods");


System.out.println("*** hypot(x,y)***");
System.out.println(  Math.hypot( obj.getNumber1(), obj.getNumber2() ) );

System.out.println("***2.POW***");

System.out.println(Math.pow( obj.getNumber1(), obj.getNumber2()));




System.out.println("***2.MultiplyExact(x,y)***");
System.out.println(Math.multiplyExact(obj.getNumber1(), obj.getNumber2()));



System.out.println("***3.subtractExact(x,y)***");
System.out.println(Math.subtractExact(obj.getNumber1(), obj.getNumber2()));

System.out.println("***4.max(x,y)***");
System.out.println(Math.max(obj.getNumber1(), obj.getNumber2()));

System.out.println("***5.min(x,y)***");
System.out.println(Math.min(obj.getNumber1(), obj.getNumber2()));





//abdulCode@github



}




 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only




}