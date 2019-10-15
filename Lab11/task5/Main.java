import java.util.Scanner;
public class Main{

public static void main(String args[]){

Scanner input  = new Scanner(System.in);
GradeBook gb= new GradeBook();
System.out.println("How many students: ");
int n =  input.nextInt();
gb.setMarks(new int[n][]);
// now marks[][] has the refernce to int[of size n given by user]
//in short now we have n refernces marks[0], marks[1]/.....marks[n]
for(int i = 0; i < gb.getMarks().length;i++)
{
	System.out.println("How many tests did student "+ (i+1) + " give");
	int numTests =  input.nextInt();
	//here wrhen we taks numTests from the user,m we define the size of arrays in the second dimensions which will hold values
	gb.getMarks()[i] = new int[numTests];
		for(int j = 0; j < gb.getMarks()[i].length; j++ ){

			System.out.println("How many marks did the student get test " + (j +1));
			int score = input.nextInt();
			gb.getMarks()[i][j] = score;
			//here we will have values stored into the 2d array, example how it happens ns --> ns[0]--ns[0][1] = 23;
			//test score of that specific index is now stored

			
		}
}
for(int i = 0; i < gb.getMarks().length; i++)
{

System.out.printf("Student %d marks \n", i+1);
	for(int j = 0; j < gb.getMarks()[i].length; j++){
		System.out.printf("Test %d marks : %d\n", j+1, gb.getMarks()[i][j]);


	}
	for(int j = 0; j < gb.getMarks()[i].length; j++){
		System.out.printf(" %d,\n", gb.getMarks()[i][j]);

		
	}
}

//prints index of the one who has the highest number of tests
System.out.println("id of the student with maximum tests " + gb.returnMaxTest(gb.getMarks()));
System.out.println("id of the student with maximum average marks" + gb.getMaxAverageStudent(gb.getMarks()));
System.out.println("Average marks of the class "  + gb.getAverageClassMarks(gb.getMarks()));

System.out.println("Average marks of each student ");
printData(gb.getEachAverageMarks(gb.getMarks()));

System.out.println("minimum marks of each student");
printData(gb.getEachMinimumMarks(gb.getMarks()));


System.out.println("Maximum marks of each student");
printData(gb.getEachMaximumMarks(gb.getMarks()));

System.out.println("Which student's average,min,max marks you want?");
int passId = input.nextInt();

gb.printAll(passId);

}
public static void printData(int arr1[][]){



for(int i = 0; i < arr1.length; i++){

for(int j = 0; j < arr1[i].length; j++){


	System.out.print(arr1[i][j]+ " , ") ;
}
System.out.println();

}
}










}