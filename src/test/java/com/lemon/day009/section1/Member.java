package com.lemon.day009.section1;

public class Member {
	private int id;
	
	private String regName;
	
	private String mobilePhone;
	
	private String password;
	
	private double leaveAmount;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegName() {
		return regName;
	}

	public void setRegName(String regName) {
		this.regName = regName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getLeaveAmount() {
		return leaveAmount;
	}

	public void setLeaveAmount(double leaveAmount) {
		this.leaveAmount = leaveAmount;
	}
	
	public Member() {
		super();
	}
	
	public Member(int id, String regName, String mobilePhone, String password, double leaveAmount) {
		super();
		this.id = id;
		this.regName = regName;
		this.mobilePhone = mobilePhone;
		this.password = password;
		this.leaveAmount = leaveAmount;
	}
	

	
	public void setMobilePhone(String mobilePhone){
		this.mobilePhone=mobilePhone;
	}
	
	
	public String getMobilePhone(){
		return this.mobilePhone;
	}
	
	
	public static void register(String mobilePhoe,String pwd){

		if (mobilePhoe.length()!=11||(pwd.length()<6||pwd.length()>16)){
			System.out.println("");
		}else {
			System.out.println("");
		}
		
	}
	
	public boolean recharge(double amount){
		if (amount<100) {
			System.out.println("");
			
			return false;
		}
		else {
			
			this.leaveAmount+=amount;
			System.out.println("");
		}
		return true;
	}
	
	public void withDraw(double money){
		if (money<100||money>500000) {
			System.out.println("");
		}
		else if (this.leaveAmount<=0||money>this.leaveAmount) {
			System.out.println("");
		}else{
			this.leaveAmount-=money;
			System.out.println("");
		}
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", regName=" + regName + ", mobilePhone=" + mobilePhone + ", password=" + password
				+ ", leaveAmount=" + leaveAmount + "]";
	}
	
}
