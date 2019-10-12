public class Employee  {

private static int count =  0;
//count will keep count of the objects, so if an object is made it updates
private String firstName;
private String lastName;


public Employee(String firstName, String lastName){
this.firstName =  firstName;
this.lastName  = lastName;
count++;
System.out.println("First Name: " +  firstName +  "Last Name: " + lastName);


}

public static int employeeCount()
{

	return count;
}


}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only