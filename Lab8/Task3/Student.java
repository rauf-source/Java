public class Student{


private String name;
private String email;
private String cnic;
private Address address;
private Course course1;
private Course course2;


public Student(String name,String cnic,  Address address){
	this.cnic = cnic;
	this.name = name;
	this.address =  address;
}
//setCourse1GetCourse1
public void setCourse1(Course course1){
	this.course1 = course1;
}
public Course getCourse1(){
	return course2;
}
//setCourse2getCourse2
public void setCourse2(Course course2){
	this.course2 = course2;
}
public Course getCourse2(Course course1){
	return course2;
}
public String getName(){

	return name;
}
public String getCnic(){
	return cnic;
}
public Address getAddress(){
return address;

}

}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only