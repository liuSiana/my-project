package com.lemon.day021.section1;

import org.eclipse.jetty.util.statistic.SampleStatistic;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class BasicClass {
	/**
	 * 此处使用static修饰全局变量
	 *    在内存中只会有一份，大家共用
	 * 如果不用static修饰，是对象属性，各不相同，此时在不同的方法中调用就会报空指针异常
	 */
	
	protected static WebDriver driver;
	
	@BeforeSuite
	@Parameters(value={"browserType","seleniumVersion","driverPath"})
	public static void beforSuite(String browserType,String seleniumVersion,String driverPath){
		driver=SeleniumUtil.openBrowser(browserType, seleniumVersion, driverPath);
		driver.get("https://www.singulato.com/wap-login?model=login");
	}
	
	@AfterSuite
	public static void afterSuit() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
}
