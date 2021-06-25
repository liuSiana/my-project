package com.lemon.day011.section1;

public class Tester {

	public static void main(String[] args) {
//		Member member=new Member();
		Member tom=new Borrower();
		Member jack=new Investor();
		
		tom.logout();
		jack.logout();

	}

}
