import java.util.Scanner;
public class Try{

	public static void main(String args[]){
Scanner input =  new Scanner(System.in);
System.out.println("");
 int ns[][];
 //can also do int ns[][] = new int[3];
 ns =  new int[4][];
//now we have 4 references in int[0], int[1], int[2], int[3]
 ns[0] = new int[6];
 ns[1] =  new int[3];
 ns[2] = new int[1];
 ns[3] =  new int[9];
//now we have defined the size of those arrays which will have int values, sizes are irregular



for(int i  = 0; i < ns.length; i++){

for(int j = 0; j <ns[i].length ;j++){

//take the values
ns[i][j] = input.nextInt();

}


}


for(int i  = 0; i < ns.length; i++){

for(int j = 0; j <ns[i].length ;j++){
//printing them all
	System.out.print(" "+ ns[i][j]+ " ");

}

System.out.println();
//adds a line
}














}









	






}