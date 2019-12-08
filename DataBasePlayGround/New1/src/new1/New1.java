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
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString("email"));
            System.out.println(resultSet.getString("gender"));
            System.out.println(resultSet.getString("status"));
        }
        
        
        }catch(SQLException e){
            e.printStackTrace();
        }
            finally{
       
    }
    }
    
}
