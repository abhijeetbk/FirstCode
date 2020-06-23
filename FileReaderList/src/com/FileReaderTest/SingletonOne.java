package com.FileReaderTest;

public class SingletonOne {
	
	private static SingletonOne one = new SingletonOne();
	
	private SingletonOne() {
		
	}

	public static SingletonOne getInstance() {
		return one;
	}
}


