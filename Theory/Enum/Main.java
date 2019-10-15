import java.util.*;
public class Main{
	public enum Status {LOST, WIN, DRAW}
	public static void main(String args[]){
Status status;

Scanner input = new Scanner(System.in);
System.out.println("Set status ..");
System.out.println("1. WIN\n2. LOST\n3. DRAW");
int num = input.nextInt();
switch(num){


	case 1:
	status =  Status.WIN;
	break;
	case 2: 
	status =  Status.LOST;
	break;
	case 3:
	status = Status.DRAW;
	break;
	default:
	System.out.println("Invalid character, I must quit :(");
}



if(status == Status.WIN){
	System.out.println("WI WIN WIN");
}
else if(status == Status.LOST){
	System.out.println("Lost Lost lOst");

}
else if(status == Status.DRAW){
	System.out.println("Drwa DrwD Draw");
}

		
	}



}