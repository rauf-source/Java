public class Employee {

private String firstName;
private String lastName;
private Date birthDate;
private Date hiringDate;
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only

public Employee(String firstName, String lastName,  Date birthDate, Date hiringDate){


	this.firstName = firstName;
	this.lastName = lastName;
	this.birthDate = birthDate;
	this.hiringDate =  hiringDate;
}

public Date getBirthDate()
{
	return birthDate;


}

public Date getHiringDate()
{
	return hiringDate;

}

public String getFirstName()
{
	return firstName;
}
public String getLastName(){

return lastName;

}
}