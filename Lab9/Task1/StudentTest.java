import java.util.Date;
public class StudentTest{
	public static void main(String args[]){

		Student s1 = new Student("20-Sp19","Mirza" );
		Student s2 = new Student("Libra" );

		Date date =  new Date();

		System.out.println("Student 1");
		System.out.println(s1.getName());
		System.out.println(s1.getCity());
		System.out.println(s1.getId());
		System.out.println(s1.getLuckyNumber());


		System.out.println("Student 2");
		System.out.println(s2.getName());
		System.out.println(s2.getCity());
		System.out.println(s2.getLuckyNumber());



		System.out.println("Today's date and time :"+ date );
	}




}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only