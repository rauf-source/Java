import java.util.*;
public class MyMethods {
//this class won't work :) copy paste the code or copy the file into your project and make it work
static Scanner input = new Scanner(System.in);

public static int inputInteger(String statement){
	System.out.print(statement + ": ");
	return input.nextInt();
}
public static double inputDouble(String statement){
	System.out.print(statement + ": ");
	return input.nextInt();
}
public static String inputString(String statement){
	System.out.print(statement + ": ");
	return scanner.nextLine();
}
public static boolean inputBoolean(String statement){
	System.out.print(statement + ": ");
	System.out.print("1 for true/ any thing else for false");
	return input.nextInt() == 1? true: false;
}
}