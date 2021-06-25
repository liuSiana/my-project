package com.lemon.day011.section4;

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
	//无参构造函数
	public Member() {
		super();
	}
	//有参构造函数
	public Member(int id, String regName, String mobilePhone, String password, double leaveAmount) {
		super();
		this.id = id;
		this.regName = regName;
		this.mobilePhone = mobilePhone;
		this.password = password;
		this.leaveAmount = leaveAmount;
	}
	

	//注册
	//判断手机号码和密码的格式是否正确ֵ
	public void setMobilePhone(String mobilePhone){
		this.mobilePhone=mobilePhone;
	}
	
	//ȡֵ
	public String getMobilePhone(){
		return this.mobilePhone;
	}
	
	//注册
	public static void register(String mobilePhoe,String pwd){

		if (mobilePhoe.length()!=11||(pwd.length()<6||pwd.length()>16)){
			System.out.println("手机号或密码格式不正确");
		}else {
			System.out.println("注册成功");
		}
		
	}
	/**
	 * 充值
	 * 如果充值
	 * 		充值金额必须大于100，并且是100的整数倍数
	 * 		
	 * @param args
	 */
	//判断充值金额
	public boolean recharge(double amount){
		if (amount<100) {
			System.out.println("充值金额小于100元！");
			
			return false;
		}
		else {
			//充值后的余额
			this.leaveAmount+=amount;
			System.out.println("充值成功！");
		}
		return true;
	}
	
	public void withDraw(double money){
		if (money<100||money>500000) {
			System.out.println("抱歉，您的提现金额不符合要求");
		}
		else if (this.leaveAmount<=0||money>this.leaveAmount) {
			System.out.println("抱歉，您的提现金额不符合要求");
		}else{
			this.leaveAmount-=money;
			System.out.println("提现成功");
		}
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", regName=" + regName + ", mobilePhone=" + mobilePhone + ", password=" + password
				+ ", leaveAmount=" + leaveAmount + "]";
	}
	
}
