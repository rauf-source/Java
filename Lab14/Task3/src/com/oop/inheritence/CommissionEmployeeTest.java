/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.inheritence;

/**
 *
 * @author Admin
 */
public class CommissionEmployeeTest {

    /**
     * @param args the command line arguments
     */ public static void main(String[] args)
 {
     //double grossSales, double commissionRate, String firstName, String lastName, String socialSecurityNumber
 // instantiate CommissionEmployee object
CommissionEmployee employee = new CommissionEmployee(
 10000, .06,"Sue", "Jones", "222-22-2222"); 


 // get commission employee data
 System.out.println(
 "Employee information obtained by get methods:");
 System.out.printf("%n%s %s%n", "First name is",employee.getFirstName()
 );
 System.out.printf("%s %s%n", "Last name is",employee.getLastName()
 );
 System.out.printf("%s %s%n", "Social security number is",employee.getSocialSecurityNumber()
 );
 System.out.printf("%s %.2f%n", "Gross sales is",employee.getGrossSales()
 );
 System.out.printf("%s %.2f%n", "Commission rate is",employee.getCommissionRate()
 );




 System.out.printf("%n%s:%n%n%s%n",
 "Updated employee information obtained by toString", employee.toString());
 } // end main
}
