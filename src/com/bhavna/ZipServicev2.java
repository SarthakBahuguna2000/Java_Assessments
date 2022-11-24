package com.bhavna;

import java.util.ArrayList;
import java.util.Date;

public  class ZipServicev2 extends ZipServicev1 {
	
	public ZipServicev2()
	{
		super();
	}
	public  void  set(City zipOb)
	{
		
			addressArr.add(zipOb);
		
	}
	public String get(int zipCode)
	{
		
		for(int i=0;i<addressArr.size();i++) {
			
			if(((City) addressArr.get(i)).getZipCode()==zipCode) {
				return addressArr.get(i).toString();
			}
		}
		return "invalid pincode , Address don't exist";
		
	}
	public  void print(int zipCode)
	{
		for(int i=0;i<addressArr.size();i++){
	
		if(((City) addressArr.get(i)).getZipCode()==zipCode) {
			System.out.println(addressArr.get(i));
		}
	
	}
}
	
}
