package com.bhavna;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.dao.StudentDao;
import com.bhavna.entities.Student;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		Student student = new Student(101, "rahul shrivastav", "chandigarh");
		int r = studentDao.insert(student);
		System.out.println("done" + r);

	}
}
