package com.lemon.day011.section4;

import java.util.Date;

public class Invest {
	private int id;
	private double amount;
	private int memberId;
	private int loanId;
	private Date createTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Invest [amount=" + amount + ", memberId=" + memberId + ", loanId=" + loanId + ", createTime="
				+ createTime + "]";
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
	 */
	public void generateRepaymentPlan(Loan loan) {
		//天标
		Repayment repayment=new Repayment();
		if (loan.getLoanTermType()==1) {
			repayment.setId(1);
			repayment.setInterest(this.getAmount());
			repayment.setInvestId(this.getId());
			repayment.setLoanId(loan.getId());
			//本金*利率/360*投资周期
			double principal=this.getAmount()*loan.getLoanRate()/360*loan.getLoanTerm();
			repayment.setPrincipal(principal);
			System.out.println(repayment);
		}else {
			//月标
			for (int i = 1; i <= loan.getLoanTerm(); i++) {
				repayment.setId(i);
				if (i==loan.getLoanTerm()) {
					repayment.setInterest(this.getAmount());
				}else{
					
					repayment.setInterest(0.0);
				}
				repayment.setInvestId(this.getId());
				repayment.setLoanId(loan.getId());
				//本金*利率/100/12*投资周期
				double principal=this.getAmount()*loan.getLoanRate()/100/12;
				repayment.setPrincipal(principal);
				System.out.println(repayment);
			}
			
		}
		
	}
	
	

}
