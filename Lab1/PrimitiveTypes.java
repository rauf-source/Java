public class PrimitiveTypes{

/*


Write a code, which uses all primitive data types of java also print the minimum
and maximum values of primitive data types.
Hint: Primitive Types (byte, short, int, long, float, double, char, Boolean)
*/
	public static void main(String args[])
	{
			byte byteNum;
			short shortNum;
			int intNum;
			long longNum;
			float floatNum;
			double doubleNum;
			char charNum;
			Boolean bool;

			byteMaxMin();


				shortMaxMin();
				intMaxMin();
				longMaxMin();
				floatMaxMin();
				 doubleMaxMin();
				charMaxMin();
				boolMaxMin();


	}
	public static void byteMaxMin(){
		byte max =(byte) ( (byte) Math.pow(2,7) - 1);
		byte min = (byte)(-(  (byte) Math.pow(2,7) ));
		System.out.println("Byte max value: " + max + "\n Byte min value: " + min);
	}
	
	public static void shortMaxMin(){

		short max =(short)(  (short) Math.pow(2,15) - 1);
		short min = (short)(-(  (short) Math.pow(2,15) ));
		System.out.println("short max value: " + max + "\n short min value: " + min);

		}
	public static void intMaxMin(){

	int max =  (int) Math.pow(2,31) - 1;
	int min = -(  (int) Math.pow(2,31) );
	System.out.println("int max value: " + max + "\n int min value: " + min);

	}
	public static void longMaxMin(){


		long max =  (long) Math.pow(2,63) - 1;
		long min = -(  (long) Math.pow(2,63) );
		System.out.println("long max value: " + max + "\n long min value: " + min);

		}
	public static void floatMaxMin(){

		float max =  (float) Math.pow(2,31) - 1;
		float min = -(  (float) Math.pow(2,31) );
		System.out.println("float max value: " + max + "\n float min value: " + min);


		}
	public static void doubleMaxMin(){

		double max =  (double) Math.pow(2,63) - 1;
		double min = -(  (double) Math.pow(2,63) );
		System.out.println("double max value: " + max + "\n double min value: " + min);
		System.out.println("double max value: " + Double.MAX_VALUE + "\n double min value: " );


		}
	public static void charMaxMin(){

		char max = 0;
		char min = (char)(-(  (char) Math.pow(2,15) ));
		System.out.println("char max value: " + max + "\n char min value: " + min);


		}
	public static void boolMaxMin(){


		System.out.print("Boolean: 1 bit ");
		}


}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only