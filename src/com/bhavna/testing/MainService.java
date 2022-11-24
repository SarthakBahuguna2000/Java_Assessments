package com.bhavna.testing;

import java.util.Scanner;

import com.bhavna.City;
import com.bhavna.ZipServicev1;
import com.bhavna.ZipServicev2;
import java.util.ArrayList;

public class MainService {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	
	
	ZipServicev2 zipOb=new ZipServicev2();
	zipOb.set(new City("India","uttarakhand","Dehradun",248001));
	zipOb.set(new City("India","Punjab","Kapurthala",144602));
	zipOb.set(new City("India","Delhi","Palam",110045));
	zipOb.set(new City("India","Haryana","Gurugram",12204));
	zipOb.set(new City("India","madhya pradesh","Anand Nagar",482004));
	System.out.println(zipOb.get(248001));
	System.out.println(zipOb.get(248140));
	System.out.println(zipOb.get(12204));
	zipOb.print(12204);
	
	
}
}

