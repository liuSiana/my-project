package com.lemon.day007.section2;

public class Member {
	public int id;
	
	public String regName;
	
	public String mobilePhone;
	
	public String password;
	
	public double leaveAmount;
	
	
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
	public void recharge(double amount){
		if (amount<100||amount%100!=0) {
			System.out.println("充值失败");
		}
		else {
			//充值成功后应该余额会增加
			this.leaveAmount+=amount;
			System.out.println("充值成功");
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
	
	public static void main(String[] args) {
		Member tom=new Member();
		tom.recharge(100);
		tom.recharge(150);
		System.out.println("提现之前的余额："+tom.leaveAmount);
		tom.withDraw(100);
		System.out.println("提现之后的余额："+tom.leaveAmount);
		tom.register("18000000000", "123123");
	}

}
