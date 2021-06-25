package com.lemon.day010.section5;

public class Tester {
	public static void main(String[] args) {
		Investor tom=new Investor();
		tom.recharge(3000.0);
		tom.setId(1);
		Loan loan=new Loan();
		loan.setAmount(1000.0);
		loan.setId(1);
		loan.setLoanRate(12);//12表示12%
		loan.setLoanTerm(30);
		loan.setLoanTermType(2);//1为月标，2为天标
		loan.setTitle("测试专用标的");
		Invest invest=tom.invest(1000.0, loan);
		System.out.println(invest);
	}

}
