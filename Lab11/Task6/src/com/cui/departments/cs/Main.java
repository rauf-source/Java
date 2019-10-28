/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.departments.cs;
import com.cui.departments.cs.program.*;
import com.cui.departments.cs.program.batch.*;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        Course course[] = new Course[3];
        course[0] = new Course(241, "Object Oriented Proramming", 4);
        course[1] = new Course(102, "Discrete Structures", 3);
        course[2] = new Course(211, "Data Structures", 3);

        
        Student s1 []= new Student[4];
        Course c1 [] = new Course[2];
        
        System.out.println("code, name, hours");
        for(int i = 0; i < c1.length; i++){
                c1[i] =  new Course(input.nextInt(), input.nextLine(), input.nextInt());
            }
        System.out.println("name");
            for(int i = 0; i < s1.length; i++){
                s1[i] =  new Student(input.nextLine(), c1);
            }
        
       
        Student s2 []= new Student[4];
        Course c2 [] = new Course[2];
        System.out.println("code, name, hours");        
        for(int i = 0; i < c2.length; i++){
                c2[i] =  new Course(input.nextInt(), input.nextLine(), input.nextInt());
            }
        System.out.println("name");        
            for(int i = 0; i < s2.length; i++){
                s2[i] =  new Student(input.nextLine(), c2);
            }
            
        Section section[] = new Section[2];   
        section[0] =  new Section("A", s1, s1[2]);
        section[1] =  new Section("B", s2, s2[2]);
        Batch batch  = new Batch(2019, "Fall", course, section);
        Program bsSe =  new Program("BSSE", batch);
        
        validate(s1, c1);
        validate(s2, c2);
        
        
        
        
        
    }
    
    public static void validate(Student []s, Course[] sos){
        
        for(int i = 0 ; i < s.length;i++){
            for(int j = 0; j < s[i].getCourses().length; i++){
                for(int k = 0; k < sos.length;k++){
                    if(sos[k].getCode() == s[i].getCourses()[i].getCode() && sos[k].getTitle().equals(s[i].getCourses()[i].getTitle()) && sos[k].getCredits() == s[i].getCourses()[i].getCredits() ){
                        
                    }
                    else
                    {
                        System.out.println("Student " + i+1 + "the course is not in the Scheme of studies");
                    }
                }
            }
        }
    }
    
}
