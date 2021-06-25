package com.lemon.day009.section2;

public class Tester {

	public static void main(String[] args) {
		Investor tom=new Investor();
		tom.recharge(10000);
		System.out.println(""+tom.getLeaveAmount());
		tom.invest(1000, new Loan());
		System.out.println(""+tom.getLeaveAmount());

	}

}
