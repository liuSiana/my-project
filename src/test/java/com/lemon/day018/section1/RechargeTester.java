package com.lemon.day018.section1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.lemon.day017.section1.*;

public class RechargeTester extends BaseTester{
  @Test
  public void f1() {
	 //1:充值金额等于0
	 double beforeLeaveAmount=jack.getLeaveAmount();
	 jack.recharge(0.0);
	 double actual=beforeLeaveAmount;
	 double expected=jack.getLeaveAmount();
	 assertEquals(actual, expected);
  }
  @Test
  public void f2() {
	  //2:充值金额小于0
		 double beforeLeaveAmount=jack.getLeaveAmount();
		 jack.recharge(-100.00);
		 double actual=beforeLeaveAmount;
		 double expected=jack.getLeaveAmount();
		 assertEquals(actual, expected);
  }
  @Test
  public void f3() {
	  //2:充值金额等于100.00
		 double beforeLeaveAmount=jack.getLeaveAmount();
		 jack.recharge(100.00);
		 double actual=beforeLeaveAmount;
		 double expected=jack.getLeaveAmount()-100;
		 assertEquals(actual, expected);
  }
  @Test
  public void f4() {
	  //2:充值金额大于100.00
		 double beforeLeaveAmount=jack.getLeaveAmount();
		 jack.recharge(1000.00);
		 double actual=beforeLeaveAmount;
		 double expected=jack.getLeaveAmount()-1000;
		 assertEquals(actual, expected);
  }
}
