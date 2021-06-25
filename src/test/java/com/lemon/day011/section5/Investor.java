package com.lemon.day011.section5;

import java.util.Date;


public class Investor extends Member{
	/**
	 * 投资：
	 * 1：投资的金额必须大于0
	 * 2：投资的金额必须大于余额
	 * 3:投资的金额必须是100的正整数倍
	 * 4：投资后的余额=余额-投资金额
	 */
	private double investAmount;

	public double getInvestAmount() {
		return investAmount;
	}

	public void setInvestAmount(double investAmount) {
		this.investAmount = investAmount;
	}
	public Invest invest(double investAmount,Loan loan){
		if (investAmount<0||investAmount>super.getLeaveAmount()||investAmount%100!=0) {
			System.out.println("投资失败！");
		}else {
			this.setLeaveAmount(this.getLeaveAmount()-investAmount);
			//投资成功后生成投资记录
			Invest invest=new Invest();
			invest.setId(1);
			invest.setInvestAmount(investAmount);
			invest.setInvestorId(this.getId());
			invest.setLoanId(loan.getId() );
			invest.setInvestTime(new Date());
			System.out.println("投资成功！");
			System.out.println("投资后余额："+this.getLeaveAmount());
			return invest;
		}
		return null;
	}
	
}
