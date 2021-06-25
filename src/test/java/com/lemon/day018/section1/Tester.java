package com.lemon.day018.section1;

import org.testng.annotations.Test;

public class Tester {
	@Test(enabled=false)
	public void f1() {
		System.out.println("Tester.f1()");
	}
	@Test(timeOut=2000)
	public void f2() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Tester.f2()");
	}
	@Test(expectedExceptions={NullPointerException.class})
	public void f3() {
		String string=null;
		System.out.println(string.length());
		System.out.println("Tester.f3()");
	}

}
