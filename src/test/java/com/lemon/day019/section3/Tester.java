package com.lemon.day019.section3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tester {

	@Test
	//通过注解将xml文件中的参数传入
	@Parameters(value={"browserType","seleniumVersion","driverPath"})//读取xml中设置的参数
	public static void name(String browserType,String seleniumVersion,String driverPath) {//在方法中定义变量来接收注解中的参数，接收对应位置的参数
		SeleniumUtil.openBrowser(browserType,seleniumVersion,driverPath);//传入参数
	}
}
