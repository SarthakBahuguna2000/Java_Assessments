package com.bhavna;

public class State extends Country {
 private String stateName;

public State(String stateName,String countryName ) {
	super(countryName);
	this.stateName = stateName;
}

public String getStateName() {
	return stateName;
}

public void setStateName(String stateName) {
	this.stateName = stateName;
}
 
}
