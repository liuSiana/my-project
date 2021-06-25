package com.lemon.day011.section3;

import java.util.ArrayList;
import java.util.Date;


public class Invest {
	private int id;//
	private Date createDate;//
	private double amount;//
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
		ArrayList<Repayment> repaymentList=new ArrayList<Repayment>();
		
		if (loan.getLoanDateType()==1) {
			Repayment repayment=new Repayment();
			repayment.setId(1);
			repayment.setInterest(this.getId());
			double interest=this.getAmount()*loan.getLoanRate()/100/360*loan.getLoanTerm();
			repayment.setInterest(interest);
			repayment.setLoanId(loan.getId());
			repayment.setPrincipal(this.getAmount());
			repayment.setStatus(0);
			repaymentList.add(repayment);
			return repaymentList;
		}if (loan.getLoanDateType()==2) {
			for (int i = 1; i <= loan.getLoanTerm(); i++) {
				Repayment repayment=new Repayment();
				repayment.setId(i);
				repayment.setInterest(this.getId());
				repayment.setLoanId(loan.getId());
				double interest=this.getAmount()*loan.getLoanRate()/100/12;
				repayment.setInterest(interest);
				if (i==loan.getLoanTerm()) {
					repayment.setPrincipal(this.getAmount());
				}else{
					repayment.setPrincipal(0);
				}
				repayment.setStatus(0);
				repaymentList.add(repayment);
//				System.out.println(repayment);
			}
			
		}
		return repaymentList;
		
	}


	
}
