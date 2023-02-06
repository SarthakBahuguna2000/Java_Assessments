package com.bhavna.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "student_details")
@Entity
public class Student {
	@Id
	@Column(name = "student_id")
	private int sId;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "student_city")
	private String studentCity;

	public Student(int sId, String studentName, String studentCity) {
		super();
		this.sId = sId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public Student() {
		super();
	}

}
