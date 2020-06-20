package com.staticdemo;

public class AdditionDemo {
	
	static {
		
	}
	private int a;
	
	private int b;

	public static void main(String[] args) {
		AdditionDemo demo = new AdditionDemo(3,5);
		int result = demo.sum();
		System.out.println("sum is "+result);
		AdditionDemo demo2 = new AdditionDemo(10,20);
		result=demo2.sum();
		System.out.println("sum is "+result);
		long res = sum(4L,3L);
		System.out.println("sum is "+res);
		Math.round(42.3);
	}
	
	AdditionDemo(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public int sum () {
		return (a+b);
		
	}
	
	public static long sum (long x, long y) {
	
		return (x+y);
	}

}
