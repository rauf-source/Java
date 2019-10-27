/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui;

/**
 *
 * @author Admin
 */

   public class GradeBook {
   
private String courseName;
private int marks[][];

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int[][] getMarks() {
        return marks;
    }

    public void setMarks(int[][] marks) {
        this.marks = marks;
    }


//methods
 //   Which student given maximum tests, print just index. Assume, index represent student id
     
    public void maximumTests(){
        int maxTests = marks[0].length;
        int loc = 0 ;
        for (int i = 1; i < marks.length; i++){
            if(maxTests < marks[i].length){
                maxTests = marks[i].length;
                loc = i;
            }
        }
        System.out.println("Student with id(index) "+ loc + " has max tests "+ maxTests);
    }
  //which student got maximum marks
    
   public void avgMaxMarks(){
         
            int avg[] =  new int[marks.length];
            for(int i = 0; i  < marks.length; i++){
                for(int j = 0; j < marks[i].length ;j++){
                    avg[i]+= marks[i][j];
                }
                avg[i] /= marks[i].length;              
              }
            //now let's check avg max marks
            int max=  avg[0];
            int loc= 0;
            for(int i = 1 ; i <  avg.length; i++){
                if(max < avg[i]){
                    max =  avg[i];
                    loc =  i;
                }
            }
         System.out.println("Student with max average marks in class : " + loc);
    }
   public void avgMarksClass(){
         
            int numTests = 0;
            int sum = 0;
            for(int i = 0; i  < marks.length; i++){
                for(int j = 0; j < marks[i].length ;j++){
                    numTests++;
                    sum+=marks[i][j];
                }
             }
              int avgNew =  sum/numTests;
         System.out.println("average class marks : " + avgNew);
    }
 //average student marks also returns array of each students average marks which will be used later  
     public int[] avgStudentMarks(){
         
            int avg[] =  new int[marks.length];
            for(int i = 0; i  < marks.length; i++){
                for(int j = 0; j < marks[i].length ;j++){
                    avg[i]+= marks[i][j];
                }
                avg[i] /= marks[i].length;              
              }
            //now let's check avg max marks
            System.out.println("\nAverage marks of each student\n");
            int i = 0;
            for(int x : avg){
                System.out.println("Student "+ i + " average marks "+ x);
                i++;
            }
            return avg;
      
    }
//max marks of each student
       public int[] maxMarksOfStudent(){
           int maxArr[] = new int[marks.length];
           System.out.println("\nMaximum marks of each student\n");
            for(int i = 0; i  < marks.length; i++){
                int max = marks[i][0];
                for(int j = 0; j < marks[i].length ;j++){
                    if(max < marks[i][j]){
                        max =  marks[i][j];
                    }

                }
                maxArr[i] = max;
                System.out.println("Student with id "+ (i) + " maximum marks : "+ max);
            }
            return maxArr;
    }
//min marks of each student     
       public int[] minMarksOfStudent(){
           int minArr[] = new int[marks.length];
           System.out.println("\nMinimum marks of each student\n");
            for(int i = 0; i  < marks.length; i++){
                int min = marks[i][0];
                for(int j = 0; j < marks[i].length ;j++){
                    if(min > marks[i][j]){
                        min =  marks[i][j];
                    }

                }
                 minArr[i] = min;
                System.out.println("Student with id "+ (i) + " minimum marks : "+ min);
            }
            return minArr;
    }
//avg min max of a specfic student function 
      
}
 

