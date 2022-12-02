package com.bhavna;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.bhavna.bean.Employee;

public class SaveDao {
    Scanner sc=new Scanner(System.in);
    Connection con = FetchDetails.connectDB();
    public void empData(){
    	try {
    	System.out.println("employee id:");
    	int empId=sc.nextInt();
    	System.out.println("employee first name:");
    	String empFirstName=sc.next();
    	System.out.println("employee Last name:");
    	String empLastName=sc.next();
    	System.out.println("joining date:");
    	String date=sc.next();
    	java.util.Date dates =new SimpleDateFormat("yyy-mm-dd").parse(date);
    	java.util.Date date1=new java.sql.Date(dates.getTime());
    	System.out.println("department id:");
    	int deptId=sc.nextInt();
    	System.out.println("salary:");
    	int salary=sc.nextInt();
    	System.out.println("employee  phone no:");
    	String phoneNo=sc.next();
    	System.out.println("employee  email:");
    	String email=sc.next();
    	//SaveDao obj1=new SaveDao();
		SaveDao.insertEmpData(new Employee(empId,empFirstName,empLastName,email,phoneNo,date1,salary,deptId), con);
    	}
    
    catch(Exception e) {
    	e.printStackTrace();
    }
    }
    	 public static void insertEmpData(Employee emp,Connection con) {
    	        try {
    	            
    	            String query="insert into employees(employee_Id, First_Name,Last_Name,email,Phone_Number ,Hire_Date,  salary,dept_id) values(?,?,?,?,?,?,?,?)";
    	            
    	            PreparedStatement pstmnt=con.prepareStatement(query);
    	            
    	            pstmnt.setInt(1, emp.getEmpId());
    	            pstmnt.setString(2, emp.getEmpFirstName());
    	            pstmnt.setString(3, emp.getEmpLastName());
    	            pstmnt.setString(4, emp.getEmail());
    	            pstmnt.setString(5, emp.getPhoneNo());
    	           pstmnt.setDate(6, emp.getDate());
    	            pstmnt.setInt(7, emp.getSalary());
    	            pstmnt.setInt(8, emp.getDeptid());
    	            
    	            
    	            pstmnt.executeUpdate();
    	            System.out.println("Data inserted successfully");
    	            
    	        } catch (Exception e) {
    	            // TODO Auto-generated catch block
    	            e.printStackTrace();
    	        }
    	    
}
}
