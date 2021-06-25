package com.lemon.day018.section2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class IETester {
	@Test
	public void f1(){
		//对IE浏览器进行设置
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, "src/test/resources/IEDriverServer.exe");
		//driver期望的能力
		DesiredCapabilities capabilities=new DesiredCapabilities();
		//忽略IE安全设置
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		//忽略IE缩放设置
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		//设置初始url
		capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://www.baidu.com");
		WebDriver driver=new InternetExplorerDriver(capabilities);
		driver.quit();
	}

}
