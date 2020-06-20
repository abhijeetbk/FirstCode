package com.polymorphism.model;

import com.polymorphism.helper.Vet;

public class PolymorphismExample {

	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		
		Animal dog = new Dog();
		dog.eat();
		animals[0]= dog;
		animals[1]= new Lion();
		animals[2]=new Hippo();
		animals[3]=new Human();
		//makeNoises(animals);
		Vet vet = new Vet();
		vet.giveShot(animals[0]);
		vet.giveShot(animals[1]);
		vet.giveShot(animals[3]);
		Animal c = getAnimal();
		//c.makeNoise();
		
	}

	private static void makeNoises(Animal[] animals) {
		animals[0].makeNoise();
		animals[1].makeNoise();
		
		
	}
	
	private static Animal getAnimal() {
		return new Lion();
	}
	
	

}
