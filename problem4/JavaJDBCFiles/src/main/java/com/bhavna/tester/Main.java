package com.bhavna.tester;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bhavna.fetchFromTable;
import com.bhavna.bean.Employee;
import com.bhavna.FetchDetails;
import com.bhavna.SaveDao;
import com.bhavna.UpdateJdbc;
public class Main {
	  

	   public static void main(String[] args) {
	     
		try {
        Connection con = null;
      
        ResultSet rs = null;
       
        con = FetchDetails.connectDB();
 
        fetchFromTable ob=new fetchFromTable();
        ob.tableDetails(con,rs);
        
        UpdateJdbc updateStatementExample = new UpdateJdbc();
        
			updateStatementExample.updateRecord(con);
		ob.salaryGreater(con, rs);
		SaveDao obj1=new SaveDao();
		obj1.empData();
		
		
        
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
      
}
}
   


