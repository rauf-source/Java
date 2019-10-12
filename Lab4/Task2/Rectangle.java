public class Rectangle{

private String color;
private int width;
private int length;





public int calculateArea()
{
return width * length;
}

public int calculatePerimeter()
{
return 2 * ( length +  width );	
}


//setters and getters for color
public void setColor(String color)
{
this.color =  color;
}
public String getColor()
{
	return color;

}
//setter and getters for width
public void setWidth(int width)
{
this.width  = width;
}
public int getWidth()
{
return width;

}
//setters and getters for length
public void setLength(int length)
{
	this.length  = length;
}
public int getLength()
{

return length;
}






}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only