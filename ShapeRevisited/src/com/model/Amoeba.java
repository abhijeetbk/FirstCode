package com.model;

public class Amoeba extends Shape implements Mutable {

	@Override
	public void mutate() {
		
		System.out.println("divide in two parts");

	}

	@Override
	public void rotate() {
		System.out.println("amoeba rotating");

	}

	@Override
	public void playSound() {
		
		System.out.println("amoeba making sound");
	}

}
