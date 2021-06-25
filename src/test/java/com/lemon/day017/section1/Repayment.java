package com.lemon.day017.section1;

public class Repayment {
	private int id;
	
	private int investId;
	
	private int loanId;

	private double interest;
	
	private double principal;

	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInvestId() {
		return investId;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public void setInvestId(int investId) {
		this.investId = investId;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Repayment [id=" + id + ", investId=" + investId + ", loanId=" + loanId + ", interest=" + interest
				+ ", principal=" + principal + ", status=" + status + "]";
	}

}
