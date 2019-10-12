import java.util.Random;
public class Student{

private String id;
private String name;
private String email;
private int age;
private int luckyNumber;
private String city;


public Student(String id, String name){
	this.id =  id;
	this.name = name;
	city = "Lahore";

	setRandomLuckyNumber();
}
public Student(String name){
	this.name = name;
	city = "Lahore";
	setRandomLuckyNumber();
}


//getters
public String getId(){
	return id;
}
public String getName(){
	return name;
}
public String getEmail(){
	return email;
}
public int getAge(){
	return age;
}
public int getLuckyNumber(){
	return luckyNumber;
}
public String getCity(){
	return city;
}
public void setRandomLuckyNumber(){
	Random num = new Random();
	
	luckyNumber = num.nextInt(10);
}







}