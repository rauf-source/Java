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
    private int id;
    private String name;
    private int age;
    private String city;

        public Student(){
            System.out.println("Constructor with zero arguments");
        }
    
        public Student(int id, String name){
            this.id  =  id;
            this.name  = name;
            System.out.println("constructor with 2 arguments");
        }

    public Student(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        
        System.out.println("Constructor with 4 arguments");
    }
        
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
