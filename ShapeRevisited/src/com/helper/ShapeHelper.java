package com.helper;

import com.impl.Cell;
import com.impl.Virus;
import com.model.Amoeba;
import com.model.Circle;
import com.model.Mutable;
import com.model.Shape;
import com.model.Square;
import com.model.Triangle;

public class ShapeHelper {

	public Shape getShape(String shape) {

		switch (shape) {
		case "circle": {
			Shape returnValue = new Circle();
			return returnValue;
		}

		case "triangle": {
			Shape returnValue = new Triangle();
			return returnValue;
		}
		case "amoeba": {
			Shape returnValue = new Amoeba();
			
			return returnValue;

		}
		case "square": {
			Shape returnValue = new Square();
			return returnValue;
		}
		case "virus":{
			System.out.println("Virus is not a shape");
			return null;
		}
		default: {
			System.out.println("Shape is not correct");
			return null;
		}

		}
	}
	
	public Mutable getMutatingObject(String input) {
		Mutable object;
		if ("amoeba".equals(input)) {
			object = new Amoeba();

		} else if ("virus".equals(input)) {
			object = new Virus();

		} else if ("cell".equals(input)) {
			object = new Cell();

		}else {
			return null;
		}
		return object;
	}
}
