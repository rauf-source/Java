package com.mit.student.main;
import com.mit.course.*;
import com.mit.student.*;
import com.mit.student.phonenumber.real.*;
import com.mit.student.address.*;
import java.util.Scanner;

public class StudentTest{

public static void main(String args[]){

Scanner input = new Scanner(System.in);
System.out.println("Please fill the following information");
	String name =  inputString("Name :");
	String cnic =  inputString("Cnic: ");

System.out.println("Address!!! ");

	String streetAddress=   inputString("streetAddress: ");
	String town = inputString("Town : ");
	String city  = inputString("City: ");
	String country = inputString("Country: ");

System.out.println("Phone Number: ");
 	
 	String countryCode = inputString("Country Code: ");
 	String cityCode =  inputString("City Code: ");
 	String lineNumber =   inputString("Line Number: ");
//String streetAddress, String town, String city, String country, PhoneNumber phoneNumber
//String countryCode, String cityCode, String lineNumber
 	System.out.println("Please input Course 1 Info");
 	String courseCode =	inputString("Enter Course Code");
 	String courseTitle = inputString("Enter Course Title"); 

 	System.out.println("Please input Course 1 Info");
 	String courseCode2 =	inputString("Enter Course Code");
 	String courseTitle2 = inputString("Enter Course Title"); 
PhoneNumber phoneNumber1 = new PhoneNumber(countryCode, cityCode, lineNumber);

Course c1 = new Course(courseCode, courseTitle);
Course c2 = new Course(courseCode2, courseTitle2);
Address address1 = new Address(streetAddress, town, city, country, phoneNumber1);
Student student1  = new Student(name, cnic, address1);
student1.setCourse1(c1);
student1.setCourse2(c2);
//Object 1 completely initialized
//Initializing object 2 now...

Student student2 = new Student("Chloe","324235-234-23-5623-", address1);


System.out.println("\n\n**** Student 2 data");
System.out.println("Name: " + student2.getName());
System.out.println("Cnic: " + student2.getCnic());
System.out.println("Address:  " );
System.out.println(student2.getAddress().getStreetAddress());
System.out.println(student2.getAddress().getTown());
System.out.println(student2.getAddress().getCity());
System.out.println(student2.getAddress().getCountry());

student1.getAddress().setCountry("LOLOLOLOLOLOLOLOLOLOLOLOL10101010101");


System.out.println("\n\n**** Student 2 data again");
System.out.println("Name: " + student2.getName());
System.out.println("Cnic: " + student2.getCnic());
System.out.println("Address:  " );
System.out.println(student2.getAddress().getStreetAddress());
System.out.println(student2.getAddress().getTown());
System.out.println(student2.getAddress().getCity());
System.out.println(student2.getAddress().getCountry());

//they change because their references are the same


}

public static String inputString(String statement){
	System.out.print(statement);
	Scanner input = new  Scanner(System.in);
	System.out.print("\n");
	return input.nextLine();
}

}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only