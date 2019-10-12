import java.util.Scanner;
public class PrintGrades{

	public static void main(String args[])
	{
		/*
		If marks are greater than or equal to 90 print A grade
If marks are greater than or equal to 80 and less than 90 print B grade
If marks are greater than or equal to 70 and less than 80 print C grade
If marks are greater than or equal to 60 and less than 70 print D grade
If marks are less than 50 print F grade*/
	
	Scanner input  =  new Scanner(System.in);
		
System.out.println("Please enter marks, an invalid char for exiting");
		boolean isInt =  input.hasNextInt();
	while(isInt)
	{	
	int marks = input.nextInt();
		if(marks <= 100)	 
			{				
				if( marks  >= 90)
				{
					System.out.println("The Grade at " + marks + " marks is " + 'A');
				}
				else if(marks >= 80 && marks < 90)
				{
					System.out.println("The Grade at " + marks + " marks is " + 'B');
				}
				else if(marks >= 70 && marks < 80)
				{
					System.out.println("The Grade at " + marks + " marks is " + 'C');		
				}
				else if(marks >= 60 && marks < 70)
				{
					System.out.println("The Grade at " + marks + " marks is " + 'D');		
				}
				else if(marks >= 50 && marks < 60)
				{
					System.out.println("The Grade at " + marks + " marks is " + 'E');		
				}
				else
				{
					System.out.println("The Grade at " + marks + " marks is " + 'F');
				}
			}
			else
			{
				System.out.println("Marks only less than 100 please");
			}
				input.nextLine();
				isInt = input.hasNextInt();
		}
			System.out.println("Invalid Character!, Program executed!!!");
	}
	


	} 




 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only