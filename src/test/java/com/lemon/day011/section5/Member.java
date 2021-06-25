package com.lemon.day011.section5;

public class Member {
	private int id;
	private String regName;
	private String pwd;
	private String mobilePhone;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public double getLeaveAmount() {
		return leaveAmount;
	}
	public void setLeaveAmount(double leaveAmount) {
		this.leaveAmount = leaveAmount;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", regName=" + regName + ", pwd=" + pwd + ", mobilePhone=" + mobilePhone
				+ ", leaveAmount=" + leaveAmount + "]";
	}
	
	/**充值
	 * 1：充值金额大于0
	 * 2：充值金额必须是100的整数倍
	 * 3:充值成功后余额增加
	 */
	public void recharge(double amount){
		if (amount<=0||amount%100!=0) {
			System.out.println("充值失败：充值金额必须是100的正整数倍");
		}else {
			System.out.println("充值成功！");
			this.setLeaveAmount(this.getLeaveAmount()+amount);
			System.out.println("充值后余额："+this.getLeaveAmount());
		}
	}

}
