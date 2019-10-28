/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cui.departments.cs.program;
import com.cui.departments.cs.program.batch.*;
/**
 *
 * @author Admin
 */
public class Program {
    private String name;
    private Batch batches;

    public Program(String name, Batch batches) {
        this.name = name;
        this.batches = batches;
    }

    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Batch getBatches() {
        return batches;
    }

    public void setBatches(Batch batches) {
        this.batches = batches;
    }
    
    
}
