package com.ExceptionHandler;

import java.util.Random;

import com.model.MyException;

public class ExceptionDemo {

	public double getNumber() throws MyException {
		Random random = new Random();
		int numerator =random.nextInt(10);
		System.out.println("numerator is "+numerator);
		random =  new Random();
		int denominator = random.nextInt(10);
		//denominator=0;
		System.out.println("denominator is "+denominator);
		if(denominator>numerator) {
			throw new MyException("denominator is greater than numerator");
			
		}
		try{
		return numerator/denominator;
		}catch(Exception e) {
			return 0;
		}
	}
	
	
}
