package com.lemon.day011.section1;

import java.util.Date;


public class Invest {
	
	private Date createDate;
	private double amount;
//	private Investor investor;
//	private Loan loan;
	private int memberId;
	private int loanId;
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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
	
	@Override
	public String toString() {
		return "Invest [createDate=" + createDate + ", amount=" + amount + ", memberId=" + memberId + ", loanId="
				+ loanId + "]";
	}
	
	

}
