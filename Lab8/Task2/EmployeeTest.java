public class EmployeeTest{

	public static void main(String args[])
	{
		Date dob = new Date(5,8,2001);
		Date hiringDate = new Date(9,12,2019);

		Employee e1 = new Employee("Abdul", "Rauf", dob, hiringDate);
	 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only
		System.out.println("NASA Lead CTO");
		System.out.println(e1.getFirstName());
		System.out.println(e1.getLastName());
		System.out.println("Birth Date " + e1.getBirthDate().getDate());		
		System.out.println("Hiring Date " + e1.getHiringDate().getDate());	
			
	}




}