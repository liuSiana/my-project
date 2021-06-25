package com.lemon.day010.section4;

import java.util.Date;


public class Invest {
	private Date createTime;
	private int loanId;
	private int memberId;
	private double amount;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "Invest [createTime=" + createTime + ", loanId=" + loanId + ", memberId=" + memberId + ", amount="
				+ amount + "]";
	}
	
	

}
