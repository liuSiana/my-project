package com.lemon.day018.section1;

import org.testng.annotations.Test;

public class Tester2 {
	/**
	 * 执行的顺序
	   1、其余的按照字典顺序执行--》b,c,d
	 * 2、最后执行配置依赖的方法-->a
	 */
	@Test
	public void b() {
		System.out.println("Tester2.b()");
	}
	@Test(dependsOnMethods={"b"})
	public void a() {
		System.out.println("Tester2.a()");
	}
	@Test
	public void d() {
		System.out.println("Tester2.d()");
	}
	@Test
	public void c() {
		System.out.println("Tester2.c()");
	}

}
