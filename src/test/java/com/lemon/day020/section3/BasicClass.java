package com.lemon.day020.section3;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class BasicClass {
	
	protected static WebDriver driver;
	
	@BeforeSuite
	@Parameters(value={"browserType","seleniumVersion","driverPath"})
	public static void t(String browserType,String seleniumVersion,String driverPath){
		driver=SeleniumUtil.openBrowser(browserType, seleniumVersion, driverPath);
		driver.get("http://www.baidu.com");
	}
}
