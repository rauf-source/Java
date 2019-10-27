/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Get number of students from user input. Number of tests for each student may be different, 
so your program shall take number of tests from user input too, of each student. After fully initializing the GradeBook object, print following information.
6.	Which student given maximum tests, print just index. Assume, index represent student id
7.	Who got maximum average marks, print the row index only
8.	Average marks of the class
9.	Average marks of each student in class
10.	Minimum marks of each student 
11.	Maximum marks of each student 
12.	Average, minimum and maximum marks of the student, of user given student ID, so get student ID from user input. (student ID is just an row index)
Write different methods in GradeBook class that perform above listed operations. Call that method from main method after initializing the GradeBook object with required data

 */
package com.cui;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class GradeBookTest {

    /**
     * @param args the command line arguments
     */
   static Scanner input  = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        GradeBook gb = new GradeBook();
        gb.setMarks(new int [inputInteger("No. of students")][]);
       //asking for how many tests a specific student gave 
        for (int i = 0; i < gb.getMarks().length; i++){
        gb.getMarks()[i] = new int[inputInteger("No. of tests of student" + (i+1))] ;
    }
    //taking in the marks in each test 
        for(int i = 0; i < gb.getMarks().length; i++){
        for(int j = 0; j < gb.getMarks()[i].length; j++){
            System.out.println();
           gb.getMarks()[i][j] =  inputInteger("marks in test"+ (j+1) + " of student " + (i+1));
        }
    }
        //these are the methods I defined in my gb object.
       gb.maximumTests();
       gb.avgMaxMarks();
       gb.avgMarksClass();
       int avgOf[] = gb.avgStudentMarks();
       int maxOf[] = gb.maxMarksOfStudent();
       int minOf[] = gb.minMarksOfStudent();
       //let's print out the marks avg,max,min of any specific student user asks
       int id =  inputInteger("Please enter the id of the student you'd like class results of");
        System.out.println("Student with id: "+ id + " results");
        System.out.println("Max marks " + maxOf[id]);
        System.out.println("Min Marks " + minOf[id]);
        System.out.println("Average Marks " + avgOf[id]);
    }
    //methods
    public static int inputInteger(String statement){
       System.out.println(statement);
       return input.nextInt();
    }
   
}
