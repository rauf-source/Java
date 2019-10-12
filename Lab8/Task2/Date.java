public class Date{
	
private int day;
private int month;
private int year;

public Date(int day, int month,int year){
	setDay(day);
	setMonth(month);
	this.year  = year;
}


public void setDay(int day)
{
	if(day >0 && day <= 30)
	{
		this.day =  day;
	}
	else
	{
		System.out.println("Invalid Day!!! Setting day to 1");
	}
}
public void setMonth(int month)
{
	if(month >0 && month <= 12)
	{
		this.month =  month;
	}
	else
	{
		System.out.println("Invalid Month!!! Setting Month to 1");
	}
}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only
public String getDate()
{
	return String.format("%d/%d/%d", day, month, year);
}

}