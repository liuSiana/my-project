package com.lemon.day011.section5;

import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
		Investor tom=new Investor();
		tom.recharge(10000.0);
		Loan loan=new Loan();
		loan.setId(1);
		loan.setLoanAmount(5000.0);
		loan.setLoanRate(10);
		loan.setLoanTerm(30);
		loan.setLoanTermType(0);
		loan.setLoanTitle("钱多多");
		Invest invest=tom.invest(1000,loan);
		System.out.println(invest);
		ArrayList<Repayment> repayments=invest.generationRepayment(loan);
		for (Repayment repayment : repayments) {
			System.out.println(repayment);
		}
	}
	

}
