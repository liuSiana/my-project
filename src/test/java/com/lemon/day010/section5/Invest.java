package com.lemon.day010.section5;

import java.util.Date;

public class Invest {
	private double amount;
	private int memberId;
	private int loanId;
	private Date createTime;
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
	

}
