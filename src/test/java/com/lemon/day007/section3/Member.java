package com.lemon.day007.section3;

public class Member {
	private int id;
	private String regName;
	private String mobilePhone;
	private String pwd;
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
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public double getLeaveAmout() {
		return leaveAmount;
	}
	public void setLeaveAmout(double leaveAmout) {
		this.leaveAmount = leaveAmount;
	}
	
	// 注册
		public void register(String mobilePhoe,String pwd){

			if (mobilePhoe.length()!=11||(pwd.length()<6||pwd.length()>16)){
				System.out.println("手机号格式不正确");
			}else {
				System.out.println("注册成功");
			}
			
		}
		/**
		 * 充值
		 * 1、充值金额不能小于100
		 * 2、充值金额必须是100的整数倍
		 * @param args
		 */
		//充值操作
		public Boolean recharge(double amount){
			if (amount<100||amount%100!=0) {
				System.out.println("充值失败");
				return false;
			}
			else {
				//充值成功后应该余额会增加
				this.leaveAmount+=amount;
				System.out.println("充值成功");
				return true;
			}
		}
		/**
		 * 提现
		 * 1、提现金额应该大于100并且小于50万
		 * 2、提现金额不能大于余额
		 * 3、余额小于等于0，提现失败
		 * @param args
		 */
		public void withDraw(double money){
			if (money<100||money>500000) {
				System.out.println("提现失败");
			}
			else if (this.leaveAmount<=0||money>this.leaveAmount) {
				System.out.println("余额不足");
			}else{
				this.leaveAmount-=money;
				System.out.println("提现成功");
			}
		}
		@Override
		public String toString() {
			return "Member [id=" + id + ", regName=" + regName + ", mobilePhone=" + mobilePhone + ", pwd=" + pwd
					+ ", leaveAmount=" + leaveAmount + "]";
		}
		

}
