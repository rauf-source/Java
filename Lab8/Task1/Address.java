public class Address{
private int streetNumber;
private String city;
private String country;



 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only

public Address(int streetNumber, String city, String country)
{

this.streetNumber = streetNumber;
this.country = country;
this.city = city;
}
//setters and getters
public void setStreetNumber(int streetNumber){

	this.streetNumber = streetNumber;

}

public void setCountry(String country){

	this.country = country;
	
}
public void setCity(String city){

	this.city = city;
	
}
public int getStreetNumber(){

	return streetNumber;
}

public String getCountry(){

	return country;
}

public String getCity(){

	return city;
}



}
