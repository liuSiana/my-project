package com.lemon.day008.section1;

public class Investor extends Member{
	public boolean recharge(double amount){
		System.out.println("开始充值ֵ");
		boolean flag=super.recharge(amount);
		if (flag) {
			System.out.println("调用继承类中的充值方法");
			
		}
		return flag;
		

	}
}
