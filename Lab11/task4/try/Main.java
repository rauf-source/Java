public class Main{
	public static void main(String args[]){
		Address a1[] = new Address[5];

		for(int i = 0 ; i < 5; i++){

			a1[i] = new Address("wow", "Los angeles", "US", "Downtown");
			System.out.println(a1[i].getCountry());
		}






	}





}