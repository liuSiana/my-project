package com.lemon.day010.section1;

public class Person {
	private String name;
	private int age;
	//人生活在地球是个常亮
	private static final String LIVE_POSITION="地球";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static String getLeavePosition() {
		return LIVE_POSITION;
	}

	
}
