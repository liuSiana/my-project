package com.lemon.day007.section1;


public class ObjectTest {
	public static void main(String[] args) {
		int age=20;
		Integer age2=new Integer(age);
		age2.intValue();
		System.out.println(age2);
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		String atr="12345";
		int i=Integer.parseInt(atr);
		long l=Long.parseLong(atr);
		float f=Float.parseFloat(atr);
		double d=Double.parseDouble(atr);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
	}

}
