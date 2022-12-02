package com.bhavna;
import java.sql.*;
public class UpdateJdbc {
	private static final String UPDATE_USERS_SQL = "update EMPLOYEES set FIRST_NAME = 'RUHI' where EMPLOYEE_ID = '1001';";
	public void updateRecord() throws SQLException {
		System.out.println(UPDATE_USERS_SQL);
      
        try (Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/Storage","root","Bhavna@123");  
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL))
        {
           
        	
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

        	e.printStackTrace();
        }
      }
        
      

	
	
}
