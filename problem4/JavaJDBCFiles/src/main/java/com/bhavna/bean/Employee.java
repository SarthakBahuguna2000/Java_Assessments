package com.bhavna.bean;

import java.util.Date;

public class Employee {
int empId,deptId,salary;
String empFirstName,empLastName,phoneNo,email;
java.sql.Date date;
public int getDeptid() {
	return deptId;
}
public void setDeptid(int deptId) {
	this.deptId = deptId;
}
public Employee(int empId,String empFirstName,String empLastName,String email,String phoneNo,Date date,int salary,int deptId) {
	super();
	this.empId = empId;
	this.deptId = deptId;
	this.empFirstName = empFirstName;
	this.empLastName = empLastName;
	this.date = (java.sql.Date) date;
	this.salary = salary;
	this.phoneNo = phoneNo;
	this.email=email;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpFirstName() {
	return empFirstName;
}
public void setEmpFirstName(String empFirstName) {
	this.empFirstName = empFirstName;
}
public String getEmpLastName() {
	return empLastName;
}
public void setEmpLastName(String empLastName) {
	this.empLastName = empLastName;
}
public java.sql.Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = (java.sql.Date) date;
}
public int getSalary() {
	return salary;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void setSalary(int salary) {
	this.salary = salary;
}
}
