package com.subclasses;

import com.Inheritance.Car;

public class SedanCars extends Car {

	

	public SedanCars() {
		System.out.println("inside no arg constructor sedan car");
	}
	
	protected SedanCars(String make,String model, String year) {
		super(make,model,year);
		System.out.println("inside param arg constructor sedan car");
	}

	public String getMake() {
		return super.getMake();
	}

}
