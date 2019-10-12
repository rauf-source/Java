import java.util.*;
//it'll be hard to convert this array prog to arrlst prog
/*

*/
public class WithArrayLists{
	public static void main(String args[]){
		/*the ratings are in triples
		each index is a specific attribute of rating for both alice and bob so
		I'm gonna make an array
*/
		Scanner input =  new Scanner(System.in);
ArrayList<Integer>  a =  new ArrayList<Integer>() ;
ArrayList<Integer>  b = new ArrayList<Integer>() ;
//later if the person gives less than 1 I will save 1 and if >100 i'll save it 100 to run it anyway with a flag in console of course
for(int i = 0; i < 3; i++){


a.add(input.nextInt());




}
System.out.println();
//later if the person gives less than 1 I will save 1 and if >100 i'll save it 100 to run it anyway with a flag in console of course
for(int i = 0; i < 3; i++){


b.add(input.nextInt());



}
System.out.println();
ArrayList<Integer>  results = new ArrayList<Integer>();
results = compareTriplets(a,b);

//main ends below

	System.out.println("Alice's points: " + results.get(0));
	System.out.println("Bob's points: " + results.get(1));


	}

	//
	public static ArrayList<Integer> compareTriplets(ArrayList<Integer>  a, ArrayList<Integer>  b){
		ArrayList<Integer>  results =  new ArrayList<Integer>();//alice's score is first
		results.add(0);
		results.add(0);

		for(int i  =0 ; i < 3; i++){
			if(a.get(i) > b.get(i)){
				results.set(0, results.get(0)+1);
				//add at 0
			}
			else if(a.get(i) < b.get(i)){
			results.set(1, results.get(1)+1) ;
			}

		}
		return results;

	}



}