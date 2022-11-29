package com.bhavna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeQuery {
	public void nameStartWithS(List<Employee> employeeList ,List<Employee> names){
		names = employeeList.stream().filter(employee ->  employee.getName().startsWith("S")).collect(Collectors.toList());
	   int count=0;
	  for (Employee name : names) {
		  count+=1;
			
		 }
	  System.out.println(count);
	}
	
	
	  public void withLocationHyderabad(List<Employee> employeeList ) {
		  
	  employeeList.parallelStream().filter(employee->employee.getLocation()=="Hyderabad").forEach(System.out::println);
	  }
	  public void empHashMap(List<Employee> employeeList ) {
		  HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		  employeeList.parallelStream().forEach(s->{ 
			  if(map.containsKey(s.getLocation())) {
				  map.get(s.getLocation()).add(s.getName());
			  }
			  else {
				  map.put(s.getLocation(), new ArrayList<String>());
				  map.get(s.getLocation()).add(s.getName());
			  }
			  
		  });
		  System.out.println(map);
	  }
	  
	  public void withSalaryGreaterThan(List<Employee> employeeList ) {
		  
	  employeeList.stream().filter(employee->employee.getSalary() > 100000).forEach(System.out::println);
	  }
	 public void sortOnNameAndLocation(List<Employee> employeeList) {
	   employeeList.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getLocation));

       for (Employee emp : employeeList) {
           System.out.println(emp);
       }
	}
}

