package com.samplejavaapp.test;

import java.util.Random;
import java.util.Scanner;

public class FirstProjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean win = false;
		int noOfTries = 0;
		System.out.println("Test Eclipse");
		Random random = new Random();
		int numToGuess = random.nextInt(10);
		Scanner scanner = new Scanner(System.in);
		checkGuess(scanner, noOfTries, numToGuess, win);
	}
	public static void checkGuess(Scanner scanner, int noOfTries, int numToGuess, boolean win){
		
		System.out.println("Enter the number");

		while (!win) {
			int guess = scanner.nextInt();
			if (guess == numToGuess) {
				System.out.println("You Win");
				win = true;
			} else if (guess > numToGuess) {
				System.out.println("Your Number is too high");
			} else {
				System.out.println("Your Number is too low");
			}
			noOfTries++;
		}
		System.out.println("Number of tires you took " + noOfTries);
	
	
	}
	
}
