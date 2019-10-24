import java.util.*;
public class Calculator {

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
			System.out.println("Enter the first number");
		int firstNum =  input.nextInt();
			System.out.println("Enter the first number");
		int secondNum = input.nextInt();
		while(true)
		{
			askInput();

			if(input.hasNextInt())
			{
				int n  = input.nextInt();
				switch(n)
				{	
					case 1:
					add(firstNum, secondNum);
					break;
					case 2:
					multiply(firstNum, secondNum);
					break;
					case 3:
					subtract(firstNum, secondNum);
					break;
					case 4:
					divide(firstNum, secondNum);
					break;
					case 5:
					mod(firstNum, secondNum);
						default:
						System.out.println("INVALID Number !!Try again");
						break;

				}
				input.nextLine();

			}
			else{
				System.out.println("Invalid Character :( I am terminated");
				break;
			}	



		}

	}
	//askInput method
	public static void askInput()
	{
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for multiplication");
		System.out.println("Enter 3 for subtraction");
		System.out.println("Enter 4 for divison");
		System.out.println("Enter 5 for mod");
		System.out.println("Please Enter your Choice");

	}
	public static void add(int num1, int num2)
	{
		System.out.println(num1 + " + " +  num2 + " = " + (num1 + num2));
	}

	public static void multiply(int num1, int num2)
	{
		System.out.println(num1 + " * " +  num2 + " = " + (num1 * num2));
	}

	public static void subtract(int num1, int num2)
	{
		System.out.println(num1 + " - "  + num2 + " = " + (num1 - num2));
	}

	public static void divide(int num1, int num2)
	{
		System.out.println(num1 + " / " +  num2 + " = " + (num1 / num2));
	}

	public static void mod(int num1,int  num2)
	{	
		if(num1 < 0)
		{
		System.out.printf("|%d| = %d\n", num1, num1* - 1);
		}
		else
		{
		System.out.printf("|%d| = %d\n", num1, num1);

		}
	
		if(num2 < 0)
		{
		System.out.printf("|%d| = %d\n", num2, num2* - 1);
		}
		else
		{
		System.out.printf("|%d| = %d\n", num2, num2);

		}
				
	
	}
}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only