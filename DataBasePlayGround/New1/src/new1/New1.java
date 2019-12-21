/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new1;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class New1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Connection connection =null;
    Statement statement = null;
    ResultSet resultSet = null;
    try {
         connection = DriverManager.getConnection("jdbc:mysql://localhost/sms", "root", "abdul123");
         statement = connection.createStatement();
         resultSet = statement.executeQuery("SELECT * FROM students");
       
        
        while(resultSet.next()){
            System.out.print(resultSet.getInt("id"));
            System.out.print(resultSet.getString("name"));
            System.out.print(resultSet.getString("email"));
            System.out.print(resultSet.getString("gender"));
            System.out.println(resultSet.getString("status"));
            
            
            
            
            
        }
       
        
        //update here
String string = "DELETE  INTO students(id, name, email, gender, status) VALUES( 110, 'Ali','ali@gmail.com','M',1);";
statement.executeUpdate(string);
        }catch(SQLException e){
        System.out.println(e.getMessage());
            }
            finally{
       
    }
    
    
    }
    
}
