package com.helper;

import java.util.ArrayList;
import java.util.Random;

import com.input.UserInput;

public class GameHelper {

	public static void main(String[] args) {
		Random random = new Random();
		int location = random.nextInt(5);
		
		ArrayList<Integer> locations = new ArrayList<>();
		locations.add(location);
		locations.add(location+1);
		locations.add(location+2);
		System.out.println("location are ");
		for (int loc : locations) {
			System.out.print(loc + " ");
		}
		SimpleDotCom dot = new SimpleDotCom();
		dot.setLocations(locations);
		boolean isGameOver = false;
		int counter=0;
		while (!isGameOver) {
			System.out.println("enter guess");
			UserInput input = new UserInput();
			String result = dot.checkYourself(input.getUserInput());
			if ("kill".equalsIgnoreCase(result)) {
				isGameOver = true;
			}
			counter++;
		}
		System.out.println("you took "+counter+" guesses");
	}

}
