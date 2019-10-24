/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Student {
 
    int id;
    String name;
    int age;
    String city;
       public Student() { 
             this(20,"Maryam");   
             System.out.println("This is default constructor");
          
    }
//other constructors were called incorrectly, they must be called in the beginning
    public Student(int id, String name) {
       this(10,"Ali",20,"Lahore"); 
       System.out.println("Constructor with two parameters");
         System.out.printf("Id: %d, Nmae: %s\n",id,name);
         
    }

    public Student(int id, String name, int age, String city) {
        System.out.println("Constructor with four parameters");
        System.out.printf("Id: %d, Nmae: %s, age: %d, City: %s\n",id,name, age, city);
    }



}
