package com.lemon.day007.section3;

public class Tester {
	public static void main(String[] args) {
		Investor investor=new Investor();
		investor.recharge(-1000.0);
		
		Borrower borrower=new Borrower();
		borrower.recharge(1000);
		
		System.out.println(borrower.toString());
	}

}
