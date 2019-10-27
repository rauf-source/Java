/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
//scanner to be used in the class
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
//initialize 2-d int array
    int [][] marks = new int[inputInteger("No. of students")][];
//now initialize the irregular part of the marks array which is the number of tests  
    for (int i = 0; i < marks.length; i++){
        marks[i] = new int[inputInteger("No. of tests of student" + (i+1))] ;
    }
//now store marks of students in tests array (marks[i][j])
    for(int i = 0; i < marks.length; i++){
        for(int j = 0; j < marks[i].length; j++){
            System.out.println();
            marks[i][j] =  inputInteger("marks in test"+ (j+1));
        }
    }
//print marks method for making code clean
    printMarks("Priting marks", marks);
    minMarks(marks);
    maxMarks(marks);
    avgMarks(marks);
    avgMarksClass(marks);
    maximumTests(marks);
//watchout, main ends below
}
    
    
    //methods
    public static int inputInteger(String statement){
        System.out.println(statement);
        return input.nextInt();
    }
//prints marks of every student's every test
    public static void printMarks(String statement, int marks[][]){
            for(int i = 0; i < marks.length; i++){
            for(int j = 0; j < marks[i].length; j++){
                System.out.println("Student "+ (i+1) + "marks in t" + (j+1) +" "+ marks[i][j] );
               
            }

        }
    }
//minimum marks of each student
    public static void minMarks(int marks[][]){

            for(int i = 0; i  < marks.length; i++){
                int min = marks[i][0];
                for(int j = 0; j < marks[i].length ;j++){
                    if(min > marks[i][j]){
                        min =  marks[i][j];
                    }

                }
                System.out.println("Student "+ (i+1) + "minimum marks : "+ min);
            }
    }
//maximum marks of each student

    public static void maxMarks(int marks[][]){

            for(int i = 0; i  < marks.length; i++){
                int max = marks[i][0];
                for(int j = 0; j < marks[i].length ;j++){
                    if(max < marks[i][j]){
                        max =  marks[i][j];
                    }

                }
                System.out.println("Student "+ (i+1) + "maximum marks : "+ max);
            }
    }
//average marks of each student

    public static void avgMarks(int marks[][]){

            for(int i = 0; i  < marks.length; i++){
                int avg = 0;
                for(int j = 0; j < marks[i].length ;j++){
                    avg+= marks[i][j];

                }
                avg/= marks[i].length;
                System.out.println("Student "+ (i+1) + "average marks : "+ avg);
            }
    }
//average marks of the whole class
    public static void avgMarksClass(int marks[][]){
         //   int avg= 0;
            //additional variables for the second way to do it
            int numTests = 0;
            int sum = 0;
            for(int i = 0; i  < marks.length; i++){
             //   int avgInternal = 0;
                for(int j = 0; j < marks[i].length ;j++){
                //    avgInternal+= marks[i][j];
                    //the following isn't necessary just another way I'll probably comment the non-precise way out at the end
                    numTests++;
                    sum+=marks[i][j];
                }

              //  avgInternal/=marks[i].length;
              //  avg +=  avgInternal;
              //anoter way to calculate

              }
              int avgNew =  sum/numTests;
            //  avg/= marks.length;

/*
//because it is in int, results could be dramatic in some cases, I think a better appoach
would be to take sum of all the marks , take the number of tests and then divide the sum by marks
that way results would be more precise
*/
         System.out.println("Student average class marks : " + avgNew);
    }
//which student has given maximum tests
    public static void maximumTests(int marks[][]){
        int maxTests = marks[0].length;
        int loc = 0 ;
        for (int i = 1; i < marks.length; i++){
            if(maxTests < marks[i].length){
                maxTests = marks[i].length;
                loc = i;
            }
        }
        System.out.println("Student with id(index) "+ loc + "has max tests "+ maxTests);
    }
}
