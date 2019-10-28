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
public class Batch {
    private int year;
    private String intake;
    private Course sos[];
    private Section section[];

    public Batch(int year, String intake, Course[] sos, Section[] section) {
        this.year = year;
        this.intake = intake;
        this.sos = sos;
        this.section = section;
    }

    
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }

    public Course[] getSos() {
        return sos;
    }

    public void setSos(Course[] sos) {
        this.sos = sos;
    }

    public Section[] getSection() {
        return section;
    }

    public void setSection(Section[] section) {
        this.section = section;
    }


}
