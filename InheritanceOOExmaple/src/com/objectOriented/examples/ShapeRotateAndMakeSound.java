package com.objectOriented.examples;

import java.util.Scanner;

import com.objectOriented.examples.shapes.Amoeba;
import com.objectOriented.examples.shapes.Circle;
import com.objectOriented.examples.shapes.Square;
import com.objectOriented.examples.shapes.Triangle;

public class ShapeRotateAndMakeSound {

	public static void main(String[] args) {
		System.out.println("Enter the shape");
		Scanner scanner = new Scanner(System.in);
		String shape = scanner.next();
		run(shape.toLowerCase());
		scanner.close();
	}

	public static void run(String shape) {

		switch (shape) {
		case "circle": {
			Circle circle = new Circle();
			circle.rotate();
			circle.makeSound();
			break;
		}
		case "square": {
			Square square = new Square();
			square.rotate();
			square.makeSound();
			break;
		}
		case "triangle": {
			Triangle triangle = new Triangle();
			triangle.rotate();
			triangle.makeSound();
			break;
		}
		case "amoeba": {
			Amoeba amoeba = new Amoeba();
			amoeba.rotate();
			amoeba.makeSound();
			break;
		}
		default: {
			System.out.println("Shape is not correct");
		}
		}
	}

}
