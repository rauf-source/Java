/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee() {
        this(999, "Default_name");
    }

    public Employee(int id, String name) {
        this(id, name, 999_999);
        this.id = id;
        this.name = name;
        System.out.println(name + "" + id);
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println(salary);
    }
    
    
    
}
