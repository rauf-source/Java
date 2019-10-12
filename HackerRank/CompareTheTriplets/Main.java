import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		/*the ratings are in triples
		each index is a specific attribute of rating for both alice and bob so
		I'm gonna make an array
*/
		Scanner input =  new Scanner(System.in);
int a[] =  new int[3];
int b[] = new int[3];
System.out.println("Please award points between 1 and 100 for rating to Alice\n1.Clarity.\n2.Originality\n3.Difficulty");
//later if the person gives less than 1 I will save 1 and if >100 i'll save it 100 to run it anyway with a flag in console of course
for(int i = 0; i < a.length; i++){

System.out.println((i+1) + ".");
a[i] = input.nextInt();

}
System.out.println("Please award points between 1 and 100 for rating to Bob\n1.Clarity.\n2.Originality\n3.Difficulty");
//later if the person gives less than 1 I will save 1 and if >100 i'll save it 100 to run it anyway with a flag in console of course
for(int i = 0; i < a.length; i++){

System.out.println((i+1) + ".");
b[i] = input.nextInt();

}
int results[] = new int [2];
results = compareTriplets(a,b);

//main ends below

	System.out.println("Alice's points: " + results[0]);
	System.out.println("Bob's points: " + results[1]);


	}

	//
	public static int[] compareTriplets(int a[], int b[]){
		int results[] =  new int [2];//alice's score is first
		for(int i  =0 ; i < 3; i++){
			if(a[i] > b[i]){
				results[0]++;
			}
			else if(a[i] < b[i]){
				results[1]++;
			}

		}
		return results;

	}



}