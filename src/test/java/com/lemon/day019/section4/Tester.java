package com.lemon.day019.section4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Tester {

	@Test
//	此处是从xml文件中的参数进行注入，此处设置的参数与xml文件中的参数一一对应，与方法中设置的参数也是一一对应
	@Parameters(value={"browserType","seleniumVersion","driverPath"})
	public static void t(String browserType,String seleniumVersion,String driverPath){
		SeleniumUtil.openBrowser(browserType, seleniumVersion, driverPath);
	}
}
