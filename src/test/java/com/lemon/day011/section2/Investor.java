package com.lemon.day011.section2;

import java.util.Date;


public class Investor extends Member{
	public boolean recharge(double amount){
		System.out.println("");
		boolean flag=super.recharge(amount);
		if (flag) {
			System.out.println("");
			
		}
		return flag;
	}
	
	public Invest invest(double loanAmout,Loan loan){
		if (loanAmout<=0||loanAmout%100!=0) {
			System.out.println("");
		}else if (loanAmout>this.getLeaveAmount()) {
			System.out.println("");
		}else {
			
			Invest invest=new Invest();
			invest.setMemberId(this.getId());
			invest.setAmount(loanAmout);
			invest.setLoanId(loan.getId());
			invest.setCreateDate(new Date());
			this.setLeaveAmount(this.getLeaveAmount()-loanAmout);
			System.out.println("");
			return invest;
		}
		return null;
	}
	

}
