package com.lemon.day019.section2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTester {

	@Test
	public void f() {
		//设置火狐浏览器可执行文件的路径
//		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		// 唤起浏览器,将设置的能力传入参数中
		//如果是3.x的版本的selenium，需要设置firefox的可执行驱动
//		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
		WebDriver webDriver = new FirefoxDriver();
		
		//关闭浏览器
		webDriver.quit();
	}
}
