package com.Inheritance;

public class Car {

	private String make;

	private String model;

	private String year;

	public String getMake() {
		return make;
	}

	public Car() {
		
	}
	
	public Car(String make,String model,String year) {
		System.out.println("inside parametrised constructor of a Car");
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
