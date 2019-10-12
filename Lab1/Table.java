//print a table of any number
import java.util.Scanner;

public class Table {


public static void main(String args[])
{	
	System.out.println("Table of Number: ");
	
	Scanner input  = new Scanner(System.in);
	int num  =  input.nextInt();
	System.out.printf("** Table of %d **\n", num);

		for(int i = 0 ; i <= 10; i++)
		{
			System.out.println(num + " * " + i + " = " + (num * i));
		}


}





}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only