package com.lemon.day019.section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.testng.annotations.Test;

public class AutoTester {

	@Test
	public void f() {
		// 设置驱动文件
//		System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
		//通常使用这种方式进行驱动文件的设置
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY,"src/test/resources/IEDriverServer.exe");
		
		// 唤起浏览器
		WebDriver webDriver = new InternetExplorerDriver();
	}
}
