package com.lemon.day011.section3;

import java.util.ArrayList;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Investor tom=new Investor();
		tom.recharge(10000.00);
		tom.setId(1);
		Loan loan=new Loan();
		loan.setId(1);//
		loan.setAmount(100000.0);//
		loan.setTitle("");
		loan.setLoanRate(12);//
		loan.setLoanTerm(6);//
		loan.setLoanDateType(2);//
		Invest invest=tom.invest(10000, loan);
		//
//		System.out.println(tom.getLeaveAmount()); 
		invest.setId(10086);
//		invest.generateRepaymentPlan(loan);
		ArrayList<Repayment> repaymentList=invest.generateRepaymentPlan(loan);
		for (Repayment repayment : repaymentList) {
			System.out.println(repayment);
		}
		
	}

}
