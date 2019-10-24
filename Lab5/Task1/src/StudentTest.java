/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student();
        Student s2 =  new Student(13, "Albert Einstein");
        System.out.println(s2.getId());
        System.out.println(s2.getName());
        Student s3 =  new Student(13, "Elon Musk",47, "Los Angeles, California" );
        System.out.println(s3.getId());
        System.out.println(s3.getName());
        System.out.println(s3.getAge());
        System.out.println(s3.getCity());
    
    }   
    
}
