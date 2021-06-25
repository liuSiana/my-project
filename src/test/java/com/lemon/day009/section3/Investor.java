package com.lemon.day009.section3;

public class Investor extends Member{
	public boolean recharge(double amount){
		System.out.println("开始充值ֵ");
		boolean flag=super.recharge(amount);
		if (flag) {
			System.out.println("调用继承类中的充值方法");
			
		}
		return flag;
		

	}
	
	public void invest(double investAmount,Loan loan){
		if (investAmount<0||investAmount%100!=0) {
			System.out.println("投资失败：充值金额必须是100的正整数！");
		}else if (investAmount>this.getLeaveAmount()) {
			System.out.println("投资失败：余额不足，请充值！");
		}else {
			this.setLeaveAmount(this.getLeaveAmount()-investAmount);
			System.out.println("投资成功，坐等收益吧！");
			System.out.println(this.getLeaveAmount());
		}
	}
}
