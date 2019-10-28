/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */public class Employee {
    
    //public enum Gender {Male, Female};
 
    private int id;
    private String name;
    private Gender gender;
    private double basicSalary;

    public Employee(int id, String name, Gender gender, double basicSalary) {
        this.id = id;
        this.name = name;
       // this.gender=Geder.valueOf()
        this.gender = gender;
        this.basicSalary = basicSalary;
    }
    public double calculateBonus(){
        if(gender == Gender.Male){
            return basicSalary/10.0;
        }
        else{
            return basicSalary * (12.0/100.0);
        }
    }

   
    
}
