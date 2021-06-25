package com.lemon.day018.section1;

import org.testng.annotations.BeforeSuite;

import com.lemon.day017.section1.Investor;

public class BaseTester {
	static Investor jack;
	@BeforeSuite
	public void beforeSiute() {
		System.out.println("初始化对象");
		jack=new Investor();
	}

}
