public class Employee {

private int employeeId;
private String employeeName;
private Address employeeAddress;

//setting employee address
public Employee(int employeeId, Address employeeAddress)
{
this.employeeId =  employeeId;
this.employeeAddress =  employeeAddress;
}
public Address getEmployeeAddress()
{

	return employeeAddress;
}

public void setEmployeeAddress(Address employeeAddress)
{
this.employeeAddress = employeeAddress;

}

public void setEmployeeName(String employeeName){

	this.employeeName =  employeeName;


}
public String getEmployeeName()
{
	return employeeName;
}
public int getEmployeeId()
{
return employeeId;
}

}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only