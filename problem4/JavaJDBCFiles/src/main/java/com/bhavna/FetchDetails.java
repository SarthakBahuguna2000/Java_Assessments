package com.bhavna;
import java.sql.*;
public class FetchDetails {
	  
	 static Connection con;
    public  static Connection connectDB() 
 
    {
    	//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_department_query", "root", "Bhavna@123");
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("connection");
              
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Storage", "root", "Bhavna@123");
            
          
        }
            
            catch (SQLException e) {
            	 
                System.out.println(e);
            }
            catch (ClassNotFoundException e) {
           	 
                System.out.println(e);
            }
          return con;
       
    }
}

