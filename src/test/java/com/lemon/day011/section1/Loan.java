package com.lemon.day011.section1;


public class Loan {
	
	private int id;
	private String title;
	private double loanRate;
	private int loanTerm;
	private double amount;
	private int loadDateType;
	
	public int getLoadDateType() {
		return loadDateType;
	}
	public void setLoadDateType(int loadDateType) {
		this.loadDateType = loadDateType;
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
