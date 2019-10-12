import java.util.Scanner;
public class EmployeeTest{
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only
	public static  void main(String args[])
	{
		Scanner input =  new Scanner(System.in);

		Address a1  = new Address(414, "Los Angeles" ,  "United States");
		Employee employee1  = new Employee(123,a1);

		
		
		Employee employee2 =  new Employee(454,a1 );
		System.out.println("Please enter the name of First Employee");
			employee2.setEmployeeName(input.nextLine());

	System.out.println("Employee1 ID: " +  employee1.getEmployeeId() );
	System.out.println("Employee1 Address: \n" +  employee1.getEmployeeAddress().getStreetNumber() );
	System.out.println(employee1.getEmployeeAddress().getCountry() );
	System.out.println(employee1.getEmployeeAddress().getCity() );
	

	System.out.println("Employee1 ID: " +  employee2.getEmployeeId() );
	System.out.println("Please enter the name of Second Employee");
				employee1.setEmployeeName(input.nextLine());

	System.out.println("Employee1 Address: \n" +  employee2.getEmployeeAddress().getStreetNumber() );
	System.out.println(employee2.getEmployeeAddress().getCountry() );
	System.out.println(employee2.getEmployeeAddress().getCity() );
	



	}




}