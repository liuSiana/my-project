package com.lemon.day017.section2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
/**
 * Method:对应一个单元测试方法
 * Class：对应每个单元测试类
 * Test：充值+提现，归到一个test
 * Suite:套件，把一系列的test归为到一个套件
 * 从上到下的范围一次增大
 * @author liuxinai
 * @date 2020年1月30日
 * @email liuxinai89@163.com
 * @desc
 */
public class rechargeTester {
  @Test
  public void f1() {
	  System.out.println(1);
  }
  @Test
  public void f2() {
	  System.out.println(2);
  }
  @Test
  public void f3() {
	  System.out.println(3);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("rechargeTester.beforeMethod()");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("rechargeTester.afterMethod()");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("rechargeTester.beforeClass()");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("rechargeTester.afterClass()");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("rechargeTester.beforeTest()");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("rechargeTester.afterTest()");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("rechargeTester.beforeSuite()");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("rechargeTester.afterSuite()");
  }

}
