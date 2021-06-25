package com.lemon.day010.section5;


public class Loan {
	//标的的信息
	private int id;
	private String title;//标的名称
	private double loanRate;//利率
	private int loanTerm;//周期
	private int loanTermType;//周期类型
	private double amount;//标的金额
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getLoanTermType() {
		return loanTermType;
	}
	public void setLoanTermType(int loanTermType) {
		this.loanTermType = loanTermType;
	}
	

}
