package com.helper;

public class SimpleDotCom {
	int[] locations = new int[3];
	int numOfHits = 0;

	public String checkYourself(String input) {
		int guess = Integer.parseInt(input);
		String result = "miss";
		for (int cell : locations) {
			if (cell == guess) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locations.length) {
			result = "kill";
		}
		System.out.println("result is " + result);
		return result;
	}

	public void setLocations(int[] locations) {
		this.locations = locations;
	}

}
