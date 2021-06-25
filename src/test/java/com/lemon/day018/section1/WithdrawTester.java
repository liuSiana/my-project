package com.lemon.day018.section1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.lemon.day017.section1.*;

public class WithdrawTester extends BaseTester{
  @Test
  public void f1() {
	  jack.getLeaveAmount();
	 System.out.println("提现测试");
  }
}
