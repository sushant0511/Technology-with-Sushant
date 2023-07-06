package com.java.test;

class Mobile
{
	public float smartPhone(float cost,String brand)
	{
		System.out.println(brand);
		return cost;
	}
	public float smartPhone(float cost,float extra,String brand)
	{
		System.out.println(brand);
		return cost+extra;
	}
}
public class TestOverload {

	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		System.out.println( mobile.smartPhone(20000,"Vivo"));
		System.out.println(mobile.smartPhone(10000,80000,"iphone"));

	}

}
