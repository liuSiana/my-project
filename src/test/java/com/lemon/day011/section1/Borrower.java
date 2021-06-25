package com.lemon.day011.section1;

public class Borrower extends Member{
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean recharge(double amount){
		System.out.println("");
		boolean flag=super.recharge(amount);
		if (flag) {
			System.out.println("");
		}
		return flag;
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("");
	}

}
