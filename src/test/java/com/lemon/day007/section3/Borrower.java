package com.lemon.day007.section3;

public class Borrower extends Member{
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean recharge(double amount){
		Boolean flag=super.recharge(amount);
		if (flag) {
			System.out.println("充值成功,可以去还款！");
		}
		return flag;
	}
}
