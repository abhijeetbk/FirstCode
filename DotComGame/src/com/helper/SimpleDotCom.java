package com.helper;

import java.util.ArrayList;

public class SimpleDotCom {
	ArrayList<Integer> locations = new ArrayList();
	String[] texts = {"a","b","c","d"};
	
	public String checkYourself(String input) {
		int guess = Integer.parseInt(input);
		String result = "miss";
		int a = locations.get(0);
		if(locations.indexOf(guess)>-1) {
			result = "hit" ;
			int index = locations.indexOf(guess);
			locations.remove(index);

			
		}
		if (locations.isEmpty()) {
			result = "kill";
		}
		System.out.println("result is " + result);
		return result;
	}

	public void setLocations(ArrayList<Integer> locations) {
		this.locations = locations;
	}

}
