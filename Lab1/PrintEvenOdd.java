import java.util.Scanner;
public class PrintEvenOdd{


	public static void main(String args[])
	{
		System.out.println("*****Odd/Even identifier*****\nLimit: ");
		//Scanner variable
		Scanner input  =  new Scanner(System.in);
		int limit  = input.nextInt();

		for(int i = 1 ; i <=limit; i++)
		{
			if(checkEvenOdd(i) ) 
			{
			
			 System.out.println(i + " is even.");
			 
			}
			 else
			 { 
			 	System.out.println(i + " is odd.");
			 
			 }

		}



	}
public static boolean checkEvenOdd(int num)
{
	if(num % 2 == 0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only



}