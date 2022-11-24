package com.bhavna;

import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
public abstract class ZipServicev1 {
protected  String country,state,city;


ArrayList<Object> addressArr = new ArrayList<Object>(5);
public ZipServicev1()
{
	
}
public abstract void set(City zipOb);

public abstract String get(int zipcode);


}
