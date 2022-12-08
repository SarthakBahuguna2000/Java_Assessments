package com.bhavna.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empId;
	private String empName;
	private String joiningDate;
	private int depId;
	private String depName;
	private int salary;
	private String status;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status=status;
	}
	public Employee(int empId, String empName, String joiningDate, int depId, String depName, int salary, String status) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.joiningDate = joiningDate;
		this.depId = depId;
		this.depName=depName;
		this.salary = salary;
		this.status=status;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", joiningDate=" + joiningDate + ", depId=" + depId
				+ ", depName="+depName+", salary=" + salary +", status="+status+ "]";
	}
}
