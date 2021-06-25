package com.lemon.day011.section5;

public class Repayment {
	private int id;
	private int investId;
	private int loanId;
	private double interest;
	private double principal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getInvestId() {
		return investId;
	}
	public void setInvestId(int investId) {
		this.investId = investId;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	
	@Override
	public String toString() {
		return "Repayment [id=" + id + ", investId=" + investId + ", loanId=" + loanId + ", interest=" + interest
				+ ", principal=" + principal +  "]";
	}
	

}
