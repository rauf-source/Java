//write only
public class GradeBook{
private String instructorName;
private String courseTitle;


public void displayGradeBookInfo()
{


System.out.println("CourseTitle : " + courseTitle +"\nInstructor Name: " +  instructorName);

}


//setterand for instructorname
public void setInstructorName( String instructorName  )
{

	this.instructorName =  instructorName;

}

//setter  for course Title

public void setCourseTitle( String courseTitle  )
{

	this.courseTitle =  courseTitle;

}



}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only