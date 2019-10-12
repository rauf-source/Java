public class PhoneNumber{
private String countryCode;
private String cityCode;
private String lineNumber;
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only
public PhoneNumber(String countryCode, String cityCode, String lineNumber)
{
	this.countryCode =  countryCode;
	this.cityCode = cityCode;
	this.lineNumber = lineNumber;

}
//SETGETcountrycode
public void setCountryCode(String countryCode){
	this.countryCode = countryCode;
}
public String getCountryCode(){

	return countryCode;
}
//CityCode
public void setCityCode(String cityCode){
	this.cityCode = cityCode;
}
public String getCityCode(){
	return cityCode;
}
//lineNumber
public void setLineNumber(String lineNumber){
	this.lineNumber =  lineNumber;

}
public String getLineNumber(){
	return lineNumber;
}

}