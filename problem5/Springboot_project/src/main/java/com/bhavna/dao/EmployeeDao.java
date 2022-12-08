package com.bhavna.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhavna.entity.Employee;

public interface EmployeeDao   extends JpaRepository<Employee, Integer>{

}
