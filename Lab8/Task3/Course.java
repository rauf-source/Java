public class Course {
private String courseCode;
private String courseTitle;
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only
public Course(String courseCode , String courseTitle)
{
	this.courseCode = courseCode;
	this.courseTitle = courseTitle;
}
//setters and getters
//setgetcourseCode
public void setCourseCode(String courseCode)
{
	this.courseCode = courseCode;
}
public String getCourseCode()
{
	return courseCode;
}
//setgetcourseTitle
public void setCourseTitle(String courseTitle)
{
	this.courseTitle =  courseTitle;
}
public String getCourseTitle()
{
	return courseTitle;
}
}