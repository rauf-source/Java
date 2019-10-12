public class StudentTest{

public static void main(String args[])
{

	Student obj1  = new Student("SP19-BSE-001", "Daniyal Rasheed",2.85, "COMSATS");
	Student obj2  = new Student("SP19-BSE-004", "Qasim Tariq",2.65, "COMSATS");
	Student obj3  = new Student("SP19-BSE-043", "Abdul Rauf",3.82, "COMSATS");
	Student obj4  = new Student("FA95-PhDPhy-044", "Elon Musk",4.00, "STANFORD");
//instantiating an object with all of its attributes
	obj1.displayInformation();
	obj2.displayInformation();
	obj3.displayInformation();
	obj4.displayInformation();

		System.out.println("ID's of Studentws enrolled in OOP ");
			System.out.println(obj1.getId());
			System.out.println(obj2.getId());
			System.out.println(obj3.getId());
		System.out.println("ID's of Studentws enrolled in Phd Physics ");
			System.out.println(obj4.getId());

}



}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only