package com.bhavna;
import java.sql.*;
public class UpdateJdbc {
	private static final String UPDATE_USERS_SQL = "update EMPLOYEES set LAST_NAME = 'Kumar' where EMPLOYEE_ID = '1004';";
	public void updateRecord(Connection con) throws SQLException {
		System.out.println(UPDATE_USERS_SQL);
      
       // try (Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/Storage","root","Bhavna@123");  
            PreparedStatement preparedStatement = con.prepareStatement(UPDATE_USERS_SQL);
        
           
        	
            preparedStatement.executeUpdate();
         /**catch (SQLException e) {

        	e.printStackTrace();
        }**/
      }
        
      

	
	
}
