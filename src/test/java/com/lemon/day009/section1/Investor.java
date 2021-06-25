package com.lemon.day009.section1;

public class Investor extends Member{
	public boolean recharge(double amount){
		System.out.println("ֵ");
		boolean flag=super.recharge(amount);
		if (flag) {
			System.out.println("");
			
		}
		return flag;
		
	}
}
