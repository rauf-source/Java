import java.util.Scanner;
public class Main{
public static void main(String args[]){
System.out.println("Size of the array");
Scanner input = new Scanner(System.in);
int size = input.nextInt();
int[] ar =  new int[size];
for (int i = 0; i < ar.length;i++){
	System.out.println("Value " + (i+ 1) );
	ar[i] =  input.nextInt();

}
System.out.println(simpleArraySum(ar));

}
public static int simpleArraySum(int[] ar) {
   			
	int sum = 0;
    for(int i = 0; i < ar.length;i++){
       sum+= ar[i];
        
         }
         return sum;

 }


}