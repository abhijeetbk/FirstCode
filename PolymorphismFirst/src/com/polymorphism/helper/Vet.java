package com.polymorphism.helper;

import com.polymorphism.model.Animal;

public class Vet {
	
	public void giveShot(Animal a) {
		a.makeNoise();
		a.wagsTale();
	}

}
