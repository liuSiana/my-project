package com.lemon.day011.section5;

public class Loan {
	/**
	 * 投资项目：
	 * 项目id、项目标题、项目周期、投资利率、周期类型（0为天标，1为月标）、项目金额
	 * 
	 */
	private int id;
	private String loanTitle;
	private double loanRate;
	private int loanTerm;
	private int loanTermType;
	private double loanAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoanTitle() {
		return loanTitle;
	}
	public void setLoanTitle(String loanTitle) {
		this.loanTitle = loanTitle;
	}
	public double getLoanRate() {
		return loanRate;
	}
	public void setLoanRate(double loanRate) {
		this.loanRate = loanRate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	public int getLoanTermType() {
		return loanTermType;
	}
	public void setLoanTermType(int loanTermType) {
		this.loanTermType = loanTermType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "Loan [id=" + id + ", loanTitle=" + loanTitle + ", loanRate=" + loanRate + ", loanTerm=" + loanTerm
				+ ", loanTermType=" + loanTermType + ", loanAmount=" + loanAmount + "]";
	}
	

}
