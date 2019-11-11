import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner input =  new Scanner(System.in);

		ArrayList<String> student = new ArrayList<String>(Arrays.asList("Ali", "Ahmad", "Umar", "Talha")); 
//		student.add("Ali");
//		student.add("Ahmad");
//		student.add("Umar");
//		student.add("Talha");
		
		display(student);
//step 1 add 2 new stdnts
		student.add("Tooba");
		student.add("Waleed");
			display(student);
//step 2 print size
		System.out.println("Size of the list  : " +  student.size() + "\n\n");
			
//step 3 add hamza
		student.add("Hamza");
			display(student);
//step 4
		student.add("Rizwan");
			display(student);
//step 5
		Collections.sort(student, Collections.reverseOrder());
			
			display(student);		

//remove tooba	
			System.out.println("After removing tooba\n");
			
				
		student =  removeStudent(student, "Tooba");
		display(student);
	
//remove the last element
student.remove(student.size() -1);
	
		System.out.println("After removing the last element");
				display(student);
		
//display second element
				System.out.println("second element of the list \n" + student.get(1) );
				display(student);
//update Waleed to Muhammad Waleed
				student.set(0, "Muhammad Waleed");
				display(student);
//displaying everything 
				System.out.println("After changing the first name");
				display(student);
//removing the first name
				student.remove(0);
				display(student);
//remove all the elements from a list
				int size = student.size();
				for(int i  = 0; i < size; i++){
					student.remove(0);
					System.out.println(student.size());
				}

	}


///***************METHODS**************
//display method
public static void display(ArrayList<String> students){
	for(String s: students){
				System.out.println("Student name "+ s);
				
			}
	System.out.println();
}
//remove method
public static ArrayList<String> removeStudent(ArrayList<String> student, String name){
	for(int i = 0 ; i < student.size(); i++ ){

		if(student.get(i) == name){
			student.remove(i);
		}

	}

		return student;

}
//printing list method
public static void printList(ArrayList<String> student){

		for(String s: student){
			System.out.println("Student name "+ s);
			
		}
}



}

/*	String a[] = new String[4];
		for(int i = 0;i < a.length;i++){
			System.out.println("Student name"+ (i+1));
			a[i] =  input.nextLine();
		}
		for(String s: a){
			System.out.println("Student name"+ s);
			
		}
		List<String> s1 = Arrays.asList(a);
*/ /*
		for(int i  = 0; i < 4; i++){

			System.out.println("Student 1: ");
			String s = input.nextLine();
			student.add(s);

		}*/ 