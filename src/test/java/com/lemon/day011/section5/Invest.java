package com.lemon.day011.section5;

import java.util.ArrayList;
import java.util.Date;

public class Invest {
	/**
	 * 投资记录：投资记录的id，投资金额，投资时间，投资项目，
	 */
	private int id;
	private double investAmount;
	private int loanId;
	private int investorId;
	private Date investTime;
	
	public Date getInvestTime() {
		return investTime;
	}
	public void setInvestTime(Date investTime) {
		this.investTime = investTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getInvestAmount() {
		return investAmount;
	}
	public void setInvestAmount(double investAmount) {
		this.investAmount = investAmount;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getInvestorId() {
		return investorId;
	}
	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}
	@Override
	public String toString() {
		return "Invest [id=" + id + ", investAmount=" + investAmount + ", loanId=" + loanId + ", investorId="
				+ investorId + ", investTime=" + investTime + "]";
	}
	/**
	 * 生成回款计划
		1:30天的项目（一次性回款），投资10000，年化收益（年利率）10%
        	1）称称多少条回款计划--》1条
        	2）总利息多少--》10000*10%/360*30
        	3）每月怎么回款--》30天到期后，连本带息一起还
		2:5个月的标（按月付息到期还本），投10000，年化收益（年化率）12%
        	1）生成多少条回款计划--》5
        	2）总利息多少--》10000*12%/12*5
        	3）每月怎么回款--》前4个月只有利息 最后一个月连本带息一起回
        	4）每月利息--》10000*12%/12
	 * @param loan
	 */
	public ArrayList<Repayment> generationRepayment(Loan loan) {
		Repayment repayment=new Repayment();
		ArrayList<Repayment> repayments=new ArrayList<Repayment>();
		//投资id
		int investId=this.getId();
		//标的id
		int loanId=loan.getId();
		//本金
		double principal=this.getInvestAmount();
		//利率
		double loanRate=loan.getLoanRate();
		//投资周期
		int loanTerm=loan.getLoanTerm();
		//投资周期的类型
		int loanTermType=loan.getLoanTermType();
		//天标
		if (loanTermType==0) {
			repayment.setId(1);
			repayment.setInvestId(investId);
			repayment.setLoanId(loanId);
			repayment.setPrincipal(principal);
			double interest=principal*loanRate/100/360*loanTerm;
			repayment.setInterest(interest);
//			System.out.println(repayment);
			repayments.add(repayment);
		}else if (loanTermType==1) {
			//月标
			for (int i = 1; i <= loanTerm; i++) {
				repayment.setId(i);
				repayment.setInvestId(investId);
				repayment.setLoanId(loanId);
				if (i==loanTerm) {
					repayment.setPrincipal(principal); 
				}
				double interest=principal*loanRate/100/12;
				repayment.setInterest(interest);
//				System.out.println(repayment);
				repayments.add(repayment);
			}
		}
		return repayments;
		
	}
	
	

}
