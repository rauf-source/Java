import java.util.*;
public class Main{
public static void main(String args[]){

Student s1 =  new Student("Ali", "Sp19-BSE-010", (double) 3.98);
Student s2 =  new Student("Ahmad", "Sp19-BSE-001", (double) 2.45);
Student s3 =  new Student("Talha", "Sp19-BSE-002", (double) 3.44);


ArrayList<Student> list  = new ArrayList<Student>();
list.add(s1);
list.add(s2);
list.add(s3);

//just added 3 objects
displayList(list, "just added 3 objects");

Student s4  = new Student("Waleed", "SP19-BSE-020", (double) 3.76);
Student s5 = new Student("Maha", "SP19-BSE-002", (double)3.66);


list.add(0,s4);
list.add(s5);

//added two more objects new one at beginning and one at last
displayList(list,"added two more objects new one at beginning and one at last");

list.remove(1);
//
displayList(list, "removed the second student");

//removing first student using obj ref

for(int i  =0; i < list.size(); i++){
	if(list.get(i) ==  s4){
		list.remove(i);
	}


}

//
displayList(list,"removing  the first student using reference");
System.out.println("Total number of students");
System.out.println(list.size());

list.set(0,new Student("Elon Musk","Sp-19-BSE-101", (double) 4.00));

System.out.println("information of the first student");

display(list.get(0));

}

public static void display(Student s){
	System.out.println(s.getName() + s.getId() +  s.getCgpa() );
	System.out.println();
}
public static void displayList(ArrayList<Student> list, String message){
System.out.println(message);
for(int i  = 0; i < list.size(); i++){

System.out.println(list.get(i).getName() + list.get(i).getId() +  list.get(i).getCgpa() );

}
System.out.println();
System.out.println();
}

}