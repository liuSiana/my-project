package com.lemon.day010.section1;

public class Investor extends Member{
	public boolean recharge(double amount){
		System.out.println("");
		boolean flag=super.recharge(amount);
		if (flag) {
			System.out.println("");
			
		}
		return flag;
	}

	public void invest(double loanAmout,Loan loan){
		if (loanAmout<=0||loanAmout%100!=0) {
			System.out.println("");
		}else if (loanAmout>this.getLeaveAmount()) {
			System.out.println("");
		}else {
			this.setLeaveAmount(this.getLeaveAmount()-loanAmout);
			System.out.println("");
		}
	}
}
