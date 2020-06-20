package com.inheritance.example;

import java.util.Scanner;

public class ProceduralCode {

	public static void main(String[] args) {
		System.out.println("Enter the shape name");
		Scanner scanner = new Scanner(System.in);
		String shape = scanner.next();
		rotate(shape);
		makeSound(shape);
		}
	
	public static void rotate(String shape) {
		//rotation logic;
		if(shape.equals("amoeba")) {
			//amoeba rotation logic
		}
		System.out.println("rotating around the center 360 degrees");
	}
	
	public static void makeSound(String shape) {
		//make sound logic;
		if(shape.equals("amoeba")) {
			System.out.println("play .mp4 file");
		}else
		System.out.println("play .mp3 file");
	}

}
