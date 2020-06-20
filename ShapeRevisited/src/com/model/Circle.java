package com.model;

public class Circle extends Shape {

	@Override
	public void rotate() {
		
		System.out.println("circle rotating");
	}

	@Override
	public void playSound() {
		System.out.println("circle playing sound");

	}

}
