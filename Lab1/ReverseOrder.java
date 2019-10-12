import java.util.Scanner;
//first make it for 923
public class ReverseOrder{

	public static void main(String args[])
	{
		
		Scanner input  = new Scanner(System.in);
			System.out.println("Please type in the number to be Reversed");
		int num =  input.nextInt();
		int temp ;//will store each value and have performed action on it
		int reverse = 0; // will store the actual reversed value
	
			for(int i = findLength(num), j = 0; i >= 0 ; i--, j++)
			{
				temp  =  num / (int)Math.pow(10,i);
				num = num % (int) Math.pow(10,i);
				temp = temp *  (int) Math.pow(10,j);
				reverse  += temp;
					
			}
				System.out.println("Reverse Number = " + reverse);

	}

	public static int findLength(int num)
	{
//342356
		int len = 0;
		for(int i = 0 ; num  /  (int)Math.pow(10,i) > 0; i++)
		{
			len++;
		}
			len--;

//System.out.println(len );
		return len;
	}


}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only