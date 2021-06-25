package com.lemon.day019.section2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class IETester {

	@Test
	public void f() {
		// 设置驱动文件
//		System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
		//通常使用这种方式进行驱动文件的设置
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY,"src/test/resources/IEDriverServer.exe");
		//设置driver期望的能力
		DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
		//忽略浏览器的缩放比例
		desiredCapabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		//忽略浏览器的安全等级设置
		desiredCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		//设置初始化URL，防止window对象丢失
		desiredCapabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://www.baidu.com");
		// 唤起浏览器,将设置的能力传入参数中
		WebDriver webDriver = new InternetExplorerDriver(desiredCapabilities);
		
		//关闭浏览器
		webDriver.quit();
	}
}
