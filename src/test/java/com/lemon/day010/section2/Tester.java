package com.lemon.day010.section2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Investor tom=new Investor();
		tom.recharge(10000);
		tom.setId(1);
		Loan loan=new Loan();
		loan.setId(1);
		loan.setAmount(100000.0);
		loan.setTitle("ת");
		loan.setLoanRate(12);
		loan.setLoanTerm(6);
		loan.setLoanDateType(1);
		Invest invest=tom.invest(1100, loan);
		
		System.out.println(invest); 

	}

}
