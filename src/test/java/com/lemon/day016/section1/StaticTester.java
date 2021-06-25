package com.lemon.day016.section1;

public class StaticTester {
	
	static {
		System.out.println("载入静态代码块");
		System.out.println(StaticTester.class);
	}

}
