import java.lang.*;
/**
 *
 * @author sp19-bse-043
 */import java.util.Scanner;
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        Employee employee[] = new Employee[inputInteger("Number of employees    ")];
        for(int i = 0; i < employee.length; i++){
            int id=  inputInteger("Id");
            String name = inputString("Name");
            
            String gender  = inputString("Gender");
             Gender g1 = Gender.valueOf(gender);
            double basicSalary =  inputDouble("BasicSalary");
           
            employee[i] = new Employee(id,name, g1 ,basicSalary);
            System.out.println("Employee bonus is" + employee[i].calculateBonus());
        }
    }
    public static int inputInteger(String statement){
        System.out.println(statement);
        return input.nextInt();
    }
    public static String inputString(String statement){
       System.out.println(statement);
       return scanner.nextLine();
   }
     public static double inputDouble(String statement){
        System.out.println(statement);
        return input.nextDouble();
    }
}
