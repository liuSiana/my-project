package com.lemon.day010.section1;

public class Tester {

	public static void main(String[] args) {
	Person p1=new Person();
	Person p2=new Person();
	
	System.out.println(p1.getLeavePosition());
	System.out.println(p2.getLeavePosition());
	System.out.println(Person.getLeavePosition());
	
	String str1="tom";
	String str2="tom";//创建之后会在字符串池中进行创建
	String str3=new String("tom");//会在堆内存中开辟新的内存空间来放置
	String str4=new String("tom");
	
	System.out.println(str1==str2);//true
	System.out.println(str3==str4);//false
	System.out.println(str1==str3);//false
	
	str4=str3;
	System.out.println(str3==str4);//true
	
	}

}
