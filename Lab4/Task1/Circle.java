public class Circle {

	private double radius;



	public void setRadius(double radius)
	{
		this.radius =  radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public double calculateArea()
	{
		return ( Math.PI * Math.pow(radius,2) );

	}
	public double calculatePerimeter()
	{

		return ( 2 * Math.PI * radius );

	}

}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only