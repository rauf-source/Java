import java.util.*;
public class Main{
	
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
Scanner input = new Scanner (System.in);
		for(int i = 0 ; i < 10; i++){
			System.out.println("value at index : "+ i);

			list.add(input.nextInt());
		}
System.out.println("Now printing values");
		for(int i = 0 ; i < 10; i++){
			System.out.println("value at index : "+ i);

			System.out.println(list.get(i));
		}



	}



}