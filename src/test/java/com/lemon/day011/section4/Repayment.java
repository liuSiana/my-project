package com.lemon.day011.section4;


public class Repayment {
	private int id; 
	private int investId; //投资记录id
	private int loanId; //标的id
	private double interest;//利息
	private double principal;//本金
	private int status;//0：表示未回款，1：表示已回款
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
