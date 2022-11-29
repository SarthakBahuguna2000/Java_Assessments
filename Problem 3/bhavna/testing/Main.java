package com.bhavna.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.bhavna.Employee;
import com.bhavna.EmployeeQuery;

public class Main {
public static void main(String [] args)
{
	List<Employee> names=new ArrayList<Employee>();
	
	
	
	
	List<Employee> employeeList = Arrays.asList(new  Employee("David", 52000, "Hyderabad"), 
	
            new  Employee("Vikas", 25000, "Hyderabad"),
            new  Employee("Shekher", 45000, "Delhi"),
            new  Employee("Jake", 65000, "Noida"),
            new  Employee("austin", 55000, "Hyderabad"),
            new  Employee("Shubham", 230000, "Dehradun"),
            new  Employee("Vikas", 30000, "Gurugram"));
	
	EmployeeQuery empObj=new EmployeeQuery();
	System.out.println("Total Employees whose Names  starts with S are:");
	
	empObj.nameStartWithS(employeeList,names);
	System.out.println();
	System.out.println("Employees who are in location hyderabad:");
	empObj.withLocationHyderabad( employeeList );
	System.out.println();
	System.out.println("locaation wise mapping");
	empObj.empHashMap( employeeList );
	System.out.println();
	System.out.println("Employees whose salary is greater than 100000:");
	empObj. withSalaryGreaterThan(employeeList);
	System.out.println();
	System.out.println("EMployees sorted based on name and location:");
	empObj.sortOnNameAndLocation(employeeList);
	System.out.println();
	
	
	   
}
}
