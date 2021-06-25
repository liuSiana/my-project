package com.lemon.day017.section1;

import java.util.ArrayList;
import java.util.Date;


public class Invest {
	private int id;//
	private Date createDate;
	private double amount;
	// private Investor investor;
	// private Loan loan;// 
	private int memberId;//
	private int loanId;// 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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


	public ArrayList<Repayment> generateRepaymentPlan(Loan loan) {
		ArrayList<Repayment> repaymentList = new ArrayList<Repayment>();
		double amount = this.getAmount();
		int investId = this.getId();
		double loanRate = loan.getLoanRate();
		int loanDateType = loan.getLoanDateType();
		int loanTerm = loan.getLoanTerm();
		
		int loanId = this.getLoanId();
		if (loanDateType == 1) {
			Repayment repayment = new Repayment();
			repayment.setId(1);
			
			double interest = amount * loanRate / 100 / 360 * loanTerm;
			repayment.setInterest(interest);
			repayment.setInvestId(investId);
			repayment.setLoanId(loanId);
			
			repayment.setPrincipal(amount);
			repayment.setStatus(0);
			repaymentList.add(repayment);
		} else if (loanDateType == 2) {
			for (int i = 1; i <= loan.getLoanTerm(); i++) {
				Repayment repayment = new Repayment();
				repayment.setId(i);
				double interest = amount * loanRate / 100 / 12;
				repayment.setInterest(interest);
				repayment.setInvestId(investId);
				repayment.setLoanId(loanId);
				if (i == loanTerm) {
					repayment.setPrincipal(amount);
				} else {
					repayment.setPrincipal(0);
				}
				repayment.setStatus(0);
				repaymentList.add(repayment);

				// System.out.println(repayment);
			}

		}
		return repaymentList;
	}

}
