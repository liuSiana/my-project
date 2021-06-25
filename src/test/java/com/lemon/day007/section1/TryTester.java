package com.lemon.day007.section1;

//import com.third.proj.RechargeTool;

public class TryTester {
public static void main(String[] args) {
	Integer value=new Integer(30);
	int intValue=value.intValue();
	System.out.println(intValue);
	
	Integer age=30;//自动装箱
	int age1=age;//自动拆箱
	
	System.out.println(age1);
	
	Integer id=100;//自动装箱
	int num=id;//自动拆箱
	System.out.println(num);
	
//	RechargeTool tool=new RechargeTool();
//	tool.recharge();
}
}
