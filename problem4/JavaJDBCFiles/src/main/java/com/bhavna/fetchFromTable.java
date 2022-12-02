package com.bhavna;
import java.sql.*;

public class fetchFromTable {
	public void tableDetails(Connection con,ResultSet rs) {
		 try {
			 
	            String sql = "select Employees.EMPLOYEE_ID,Employees.FIRST_NAME,Employees.LAST_NAME,Employees.HIRE_DATE,Employees.SALARY,department.dept_name from EMPLOYEES inner join department on EMPLOYEES.dept_id=department.dept_id ";
	            PreparedStatement p = con.prepareStatement(sql);
	            rs = p.executeQuery();
	 
	            System.out.println("EMPLOYEE_ID\t\tFIRST_NAME\tLAST_NAME\t\tHIRE_DATE\t\tSALARY\t\tdept_name");
	 
	            while (rs.next()) {
	 
	                int empId = rs.getInt("EMPLOYEE_ID");
	                String firstName = rs.getString("FIRST_NAME");
	                String lastName = rs.getString("LAST_NAME");
	                String dateOfJoining = rs.getString("HIRE_DATE");
	                String salary = rs.getString("SALARY");
	                //String deptId = rs.getString("dept_id");
	                String deptName = rs.getString("dept_name");
	                System.out.println(empId + "\t\t\t" + firstName + "\t\t " + lastName+ "\t\t" + dateOfJoining +"\t\t" + salary +"\t\t"  +"\t\t"+ deptName);
	                
	            }
	            
		        
		       
	     
		 }
	        catch (SQLException e) {
	 
	            System.out.println(e);
	        }
		   }
	
    public void salaryGreater(Connection con, ResultSet rs)
    {
    	try {
    	 String sql1 = "select department.dept_name,count(dept_name)   from department inner join employees on department.dept_id=employees.dept_id where salary>30000 group by dept_name;";
	        PreparedStatement p1;
			
				p1 = con.prepareStatement(sql1);
			
	        rs = p1.executeQuery();

	        System.out.println("dept_name \t\t count");

	        while (rs.next()) {

	        	
	            String deptName = rs.getString("dept_name");
	            String deptCount=rs.getString("count(dept_name)");
	            System.out.println( deptName +"\t\t\t" +deptCount);
	            
	        }
    	} catch (SQLException e) {
			
			e.printStackTrace();
		}
     }
   }


