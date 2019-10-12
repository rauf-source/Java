public class Student{
	
private String id;
private String name;
private double cgpa;
private String uniName;

public Student(String id, String name, double cgpa, String uniName)
{

this.id  = id;
this.name =  name;
this.cgpa =  cgpa;
this.uniName =  uniName;


}

public void displayInformation()
{
	System.out.printf("Id : %s Name : %s CGPA : %.2f University: %s\n",id,name,cgpa,uniName); 

}
public String getId ()
{
	return id;
}
}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only