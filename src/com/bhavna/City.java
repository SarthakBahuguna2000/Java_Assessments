package com.bhavna;

public class City extends State{
	private int zipCode;
	private String cityName;
public City( String countryName,String stateName,  String cityName, int zipCode) {
		super(stateName, countryName);
		this.zipCode = zipCode;
		this.cityName = cityName;
		
	}


@Override
public String toString() {
	return "City [zipCode=" + zipCode + ", cityName=" + cityName + ", stateName=" + getStateName()
			+ ", countryName=" + getCountryName() +  "]";
}


public int getZipCode() {
	return zipCode;
}

public void setZipCode(int zipCode) {
	this.zipCode = zipCode;
}


public String getCityName() {
	return cityName;
}

public void setCityName(String cityName) {
	this.cityName = cityName;
}

}
