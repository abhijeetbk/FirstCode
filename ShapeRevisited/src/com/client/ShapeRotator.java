package com.client;

import java.util.Scanner;

import com.helper.ShapeHelper;
import com.model.Mutable;
import com.model.Shape;

public class ShapeRotator {

	public static void main(String[] args) {
		System.out.println("Enter the shape");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		go(input);
		scanner.close();
	}

	private static void go(String input) {
		ShapeHelper helper = new ShapeHelper();
		try {
			Shape shape = helper.getShape(input);
			shape.rotate();
			shape.playSound();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			//e1.notifyAll();
			System.out.println(input + " can not rotate or make sound");
		}
		Mutable object = helper.getMutatingObject(input);
		try {
			object.mutate();
		} catch (Exception e) {
			System.out.println(input + " can not mutate");
		}

	}

}
