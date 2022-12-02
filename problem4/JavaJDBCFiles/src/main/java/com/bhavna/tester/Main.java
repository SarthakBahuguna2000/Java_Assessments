package com.bhavna.tester;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bhavna.fetchFromTable;
import com.bhavna.FetchDetails;
import com.bhavna.UpdateJdbc;
public class Main {
	  

	   public static void main(String[] args) {
	     
		
        Connection con = null;
      
        ResultSet rs = null;
       
        con = FetchDetails.connectDB();
 
        fetchFromTable ob=new fetchFromTable();
        ob.tableDetails(con,rs);
        
        UpdateJdbc updateStatementExample = new UpdateJdbc();
        try {
			updateStatementExample.updateRecord();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
       ob.salaryGreater(con, rs);
}
}
   


