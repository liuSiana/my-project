package com.lemon.day010.section4;


public class Tester {
	public static void main(String[] args) {
		Investor tom=new Investor();
		tom.setId(1);
		tom.recharge(100000.0);
		Loan loan=new Loan();
		loan.setId(1);
		loan.setLoanTerm(6);
		loan.setLoanTermType(1);//1表示月标，2表示天标
		loan.setTitle("aaa");
		loan.setLoanRate(5);
		loan.setAmount(1000.0);
		Invest invest=tom.invest(1000.0, loan);
		System.out.println(invest);
			
	}

}
