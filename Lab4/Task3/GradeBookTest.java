//write only
import java.util.Scanner;

public class GradeBookTest {

public static void main(String args[])
{

GradeBook obj  = new GradeBook();
Scanner input  = new Scanner(System.in);

	System.out.println("Type in the course title");
	obj.setCourseTitle(input.nextLine());
		System.out.println("Type in the Instructor name");
	obj.setInstructorName(input.nextLine());

obj.displayGradeBookInfo();

}




}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only