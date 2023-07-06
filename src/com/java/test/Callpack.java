package com.java.test;

public class Callpack {

	
	private void test()
	{
		System.out.println("Hi from Private ");
	}
	
	
	public static void main(String[] args) {

		Callpack callpack=new Callpack();
		callpack.test();
		
		
//			System.out.println("Hi From Main");
//			TestEncap testEncap=new TestEncap();
//			testEncap.show();
	}

}
