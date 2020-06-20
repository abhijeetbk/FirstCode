package com.client;

import com.Inheritance.Car;
import com.subclasses.MiniVan;
import com.subclasses.SedanCars;

public class CarRunner {

	public static void main(String[] args) {
		String a1 = "Honda";
		System.out.println (a1.charAt(2));
		StringBuilder builder1= new StringBuilder(a1);
		builder1.reverse();
		System.out.println(builder1.toString());
		Car car = new Car();
		StringBuffer buffer1 = new StringBuffer(builder1);
		buffer1.reverse();
		System.out.println(buffer1.toString());
		Car car1 = new Car("Toyota","Camry","2015");
	}

}
