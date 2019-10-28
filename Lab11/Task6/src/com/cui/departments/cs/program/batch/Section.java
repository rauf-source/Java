/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.departments.cs.program.batch;

/**
 *
 * @author Admin
 */
public class Section {
    private String name;
    private Student students[];
    private Student cr;
    //specific section's stdnt must be the cr

    public Section(String name, Student[] students, Student cr) {
        this.name = name;
        this.students = students;
        this.cr = cr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student getCr() {
        return cr;
    }

    public void setCr(Student cr) {
        this.cr = cr;
    }
    

}
