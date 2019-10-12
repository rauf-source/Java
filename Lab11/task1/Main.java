import java.util.Scanner;
public class Main{
	
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Put in the size of array");
int n = input.nextInt();
int [] arr =  new int[n];


for(int i  = 0 ; i < arr.length; i++){
System.out.println("Put in the value for " + i + " index");
arr[i] =  input.nextInt();


}

for(int i = 0; i < arr.length; i++){

	System.out.println("Value at index : " + i + " is " + arr[i]);
}

//maximum number
int max = arr[0];
int locMax = 0;
for(int i  = 0 ; i < arr.length ; i++)
{

if(max < arr[i]){
	max = arr[i];
	locMax = i;
}

}
System.out.println("Maximum number " + max + "index " +  locMax);

	System.out.println("Average of all the numbers");
int sum = 0;
	for(int i = 0 ; i < arr.length; i++){

	sum+= arr[i];
	}
int average =  sum/arr.length;
System.out.println(average);



}
}