package com.lemon.day020.section3.login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lemon.day020.section3.BasicClass;

public class SucessTester extends BasicClass{
	@Test
	public void f1() {
		//使用id定位元素
		driver.findElement(By.id("kw")).sendKeys("奇点汽车");
		
	}
	@Test
	public void f2() {
		//使用id定位元素
		driver.findElement(By.id("kw")).sendKeys("奇点汽车01");
	}
}
