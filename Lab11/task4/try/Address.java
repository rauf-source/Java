public class Address {

private String streetAddress;
private String town;
private String city;
private String country;

 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only
public Address(String streetAddress, String town, String city, String country){

	this.streetAddress =  streetAddress;
	this.town =  town;
	this.city = city;
	this.country = country;
}
//street address
public void  setStreetAddress(String streetAddress){
this.streetAddress = streetAddress;

}
public String getStreetAddress(){
	return streetAddress;
}
//town
public void  setTown(String town){
this.town = town;
}

public String getTown(){
	return town;
}
//city
public void  setCity(String city){
this.city = city;
}

public String getCity(){
	return city;
}
//setCountry
public void  setCountry(String country){
this.country = country;
}

public String getCountry(){
	return country;
}


}