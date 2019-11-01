
package com.oop.inheritence;

/**
 *
 * @author Admin
 */// Fig. 9.5: CommissionEmployeeTest.java
 // CommissionEmployee class test program.

 public class HourlyEmployeeTest
 {
 public static void main(String[] args)
 {
     //double grossSales, double commissionRate, String firstName, String lastName, String socialSecurityNumber
 // instantiate CommissionEmployee object
HourlyEmployee employee = new HourlyEmployee(
 10000, 14,"Sue", "Jones", "222-22-2222"); 


 // get commission employee data
 System.out.println(
 "Employee information obtained by get methods:");
 System.out.printf("%n%s %s%n", "First name is",employee.getFirstName()
 );
 System.out.printf("%s %s%n", "Last name is",employee.getLastName()
 );
 System.out.printf("%s %s%n", "Social security number is",employee.getSocialSecurityNumber()
 );
 System.out.printf("%s %.2f%n", "Hourly Wage",employee.getWage()
 );
 System.out.printf("%s %.2f%n", "HOurs worked",employee.getHours()
 );




 System.out.printf("%n%s:%n%n%s%n",
 "Updated employee information obtained by toString", employee.toString());
 } // end main
 } 