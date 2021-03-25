package com.tyss.designpattern;


public class SingleTon {
	
	private static SingleTon single = null;

	// private constructor restricts object creation outside the class
	private SingleTon() {
	}

	
	public static SingleTon getInstance() {
		if (single== null) {
			single = new SingleTon();
			System.out.println("single ton");
			return single;
		} else {
			System.out.println("another instance cannot be created");
			return single;

		}
	}

	public static void main(String[] args) {
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		SingleTon s3 = SingleTon.getInstance();
//		SingleTon.getInstance();
//		SingleTon.getInstance();
		System.out.println(s1 == s2);

	}
}
