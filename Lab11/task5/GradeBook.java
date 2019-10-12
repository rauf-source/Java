//Make GradeBook class with courseName and grades fields
public class GradeBook{

private String courseName;
private int[][] marks;
private int[] id;
//get set marks
public void setMarks(int [][] marks){
	this.marks = marks;
}
public int[][] getMarks(){
	return marks;
}
public void setId(int[] id){
	this.id =  id;
}
public int[] getId(){
	return id;
}







public static int returnMaxTest(int [][] arr){

int max = 0;
int index = 0;
for(int i = 0; i < arr.length; i++){


if(arr[i].length > max){
	max = arr[i].length;
	index = i;
}

}

return index;

}


public static int getMaxAverageStudent(int [][] arr){
// /2.	Who got maximum average marks
int avg = 0;
int max=  0;
int loc = 0;
for(int i = 0;i < arr.length;i++){

	for(int j = 0; j < arr[i].length;j++){
		avg += arr[i][j];


	}
	avg = avg/arr[i].length;
	if(max < avg ){

		max = avg;
		loc = i;
	}
}

return loc;




}
public static int getAverageClassMarks(int [][] arr){
int avg =  0;
int len = 0;
for(int i = 0 ; i < arr.length;i++){

	for(int j = 0; j < arr[i].length; j++){

		avg+= arr[i][j];

	}
	len += arr[i].length;

}
		avg = avg/len;
		return (avg);
}



public static int[][] getEachAverageMarks(int [][] arr){
// ecach maximum average marks
int avg = 0;
int max=  0;
int loc = 0;
int solved[][] =  new int[arr.length][2];
for(int i = 0;i < arr.length;i++){
avg = 0;
	for(int j = 0; j < arr[i].length;j++){
		
		avg += arr[i][j];


	}
	avg = avg/arr[i].length;
	System.out.println(avg);
	solved[i][0] = i;
	solved[i][1] = avg;

}
	return solved;

}
public static int[][] getEachMinimumMarks(int [][] arr){
	int avg = arr[0][0];
int max=   arr[0][0];
int loc = 0;
int solved[][] =  new int[arr.length][2];
for(int i = 0;i < arr.length;i++){
max =  arr[0][0];
	for(int j = 0; j < arr[i].length;j++){
		
		if(max > arr[i][j]){

			max =  arr[i][j];
		}


	}
	
	System.out.println(max);
	solved[i][0] = i;
	solved[i][1] = max;

}
	return solved;

}

public static int[][] getEachMaximumMarks(int [][] arr){
	int avg = arr[0][0];
int max=   arr[0][0];
int loc = 0;
int solved[][] =  new int[arr.length][2];
for(int i = 0;i < arr.length;i++){
max =  arr[0][0];
	for(int j = 0; j < arr[i].length;j++){
		
		if(max < arr[i][j]){

			max =  arr[i][j];
		}


	}
	
	System.out.println(max);
	solved[i][0] = i;
	solved[i][1] = max;

}
	return solved;

}


}