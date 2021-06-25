package com.lemon.day018.section1;

import org.testng.annotations.Test;

public class Tester3 {
	@Test(groups={"g1"})
	public void b() {
		System.out.println("Tester2.b()");
	}
	@Test(groups={"g1"})
	public void a() {
		System.out.println("Tester2.a()");
	}
	@Test(groups={"g2"})
	public void d() {
		System.out.println("Tester2.d()");
	}
	@Test(groups={"g3"})
	public void c() {
		System.out.println("Tester2.c()");
	}

}
