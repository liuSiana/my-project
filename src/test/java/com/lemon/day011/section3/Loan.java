package com.lemon.day011.section3;
public class Loan {
	private int id;
	private String title;
	private double loanRate;
	private int loanTerm;
	private double amount;
	private int loanDateType;
	
	public int getLoanDateType() {
		return loanDateType;
	}
	public void setLoanDateType(int loanDateType) {
		this.loanDateType = loanDateType;
	}
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
	

}
