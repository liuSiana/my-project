package com.lemon.day011.section4;

import java.util.Date;


public class Investor extends Member{
	public boolean recharge(double amount){
		System.out.println("开始充值ֵ");
		boolean flag=super.recharge(amount);
		if (flag) {
			System.out.println("调用继承类中的充值方法");
			
		}
		return flag;
		
	}
	
	public Invest invest(double investAmount,Loan loan){
		if (investAmount<0||investAmount%100!=0) {
			System.out.println("投资失败：充值金额必须是100的正整数！");
		}else if (investAmount>this.getLeaveAmount()) {
			System.out.println("投资失败：余额不足，请充值！");
		}else {
			//投资成功后生成一条投资记录
			//投资记录的信息包含：投资金额、投资标的id，投资人的id，投资的时间
			Invest invest=new Invest();
			invest.setAmount(investAmount);//生成的订单中的投资金额就是实际的投资金额
			invest.setCreateTime(new Date());
			invest.setLoanId(loan.getId());//生成的订单中标的id就是投资时选择的标的id
			invest.setMemberId(this.getId());//投资人的id就是当前对象的id,当前类继承了Member类，所以可以直接调用Member的属性
			this.setLeaveAmount(this.getLeaveAmount()-investAmount);
			System.out.println("投资成功，坐等收益吧！");
			System.out.println(this.getLeaveAmount());
			return invest;//返回一个投资记录的对象
		}
		return null;
	}
}
