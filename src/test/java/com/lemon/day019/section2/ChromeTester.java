package com.lemon.day019.section2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTester {

	@Test
	public void f() {
		//设置Chrome浏览器可执行文件的路径
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		// 唤起浏览器,将设置的能力传入参数中
		WebDriver webDriver = new ChromeDriver();
		
		//关闭浏览器
		webDriver.quit();
	}
}
