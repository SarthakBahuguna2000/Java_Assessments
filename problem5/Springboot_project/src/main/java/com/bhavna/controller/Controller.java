package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.entity.Employee;
import com.bhavna.service.EmployeeService;
@RestController
public class Controller {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome";
	}
	
	@GetMapping(value="/getEmployees",produces=MediaType.APPLICATION_XML_VALUE)
	public List<Employee> getEmployees(){
		return this.employeeService.getEmployees();
	}
	
	@GetMapping(path="/getActiveEmployees",produces=MediaType.APPLICATION_XML_VALUE)
	public List<Employee> getActEmployees(){
		
		return this.employeeService.getActiveEmployees();
		
	}
	
	@GetMapping("/getEmployee/{empId}")
	public Employee searchEmployee(@PathVariable String empID) {
		return this.employeeService.searchEmployee(Integer.parseInt(empID));
	}
	
	@PostMapping(path="/addEmployee", consumes="application/json")
	public void addEmp(@RequestBody Employee employee) {
		this.employeeService.addEmployee(employee);
	}
}
