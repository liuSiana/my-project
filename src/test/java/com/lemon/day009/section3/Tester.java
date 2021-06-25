package com.lemon.day009.section3;

public class Tester {
	public static void main(String[] args) {
		Investor tom=new Investor();
		tom.recharge(10000.0);
		tom.invest(1110.0, new Loan());
	}

}
