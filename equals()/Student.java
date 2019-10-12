
import java.util.Scanner;
public class Student{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name of First Student:");
        String s1 = sc.nextLine(); 
        System.out.print("Enter Name of Second Student:");
        String s2 = sc.nextLine(); 
        
        if(s1==s2)
        {
            System.out.println("Both student have same name relational  ");
        }

        if(s1.equals(s2))
         
            System.out.println("Both student have same name");
        
         else
         System.out.println("Both student have different name");
    }
    }