package com.lemon.day018.section2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.testng.annotations.Test;

public class FireFoxTester {
	@Test
	public void f(){
		//如果火狐没有安装在默认的路径下，执行打开火狐浏览器会报错，此时进行以下配置就可以正常打开火狐浏览器
//		System.setProperty("driver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		System.setProperty(SystemProperty.BROWSER_BINARY, "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
	}

}
