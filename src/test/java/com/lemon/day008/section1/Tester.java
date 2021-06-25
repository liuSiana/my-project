package com.lemon.day008.section1;


public class Tester {
	public static void main(String[] args) {

		Member jack=new Borrower();
		Borrower borrower=(Borrower)jack;
		borrower.setAddress("dddd");
		
		jack.recharge(-10000);
		
		
		Member rose = new Investor();
		rose.setId(1);
		rose.recharge(5000);
		System.out.println(rose.toString());
		
		Investor investor=new Investor();
		System.out.println(investor.toString());
		
	}
}
