package com.lemon.day020.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FindElement {
	@Test
	//通过注解将xml文件中的参数传入
	@Parameters(value={"browserType","seleniumVersion","driverPath"})//读取xml中设置的参数
	public static void f(String browserType,String seleniumVersion,String driverPath) throws InterruptedException{//在方法中定义变量来接收注解中的参数，接收对应位置的参数
		WebDriver webDriver=SeleniumUtil.openBrowser(browserType,seleniumVersion,driverPath);//传入参数
		webDriver.get("http://www.baidu.com");
		// 使用id查找元素
		/*WebElement inputElement = webDriver.findElement(By.id("kw"));
		String actual = inputElement.getAttribute("autocomplete");
		System.out.println(actual);
		Assert.assertEquals(actual, "off");*/
		
		//通过名称查找元素
		/*WebElement inputElement = webDriver.findElement(By.name("wd"));
		String actual = inputElement.getAttribute("autocomplete");
		System.out.println(actual);
		Assert.assertEquals(actual, "off");*/

		// 使用tagName查找元素（很少用）
		/*List<WebElement> inputElements = webDriver.findElements(By.tagName("input"));
		for (WebElement webElement : inputElements) {
			String actual = webElement.getAttribute("autocomplete");
			System.out.println(actual);
		}*/
		
		// 使用className查找元素
		/*List<WebElement> inputElements = webDriver.findElements(By.className("s_ipt"));
		for (WebElement webElement : inputElements) {
			String actual = webElement.getAttribute("autocomplete");
			System.out.println(actual);
		}*/
		
		//通过linktext查找元素
//		WebElement element = webDriver.findElement(By.linkText("hao123"));
		/*WebElement element = webDriver.findElement(By.partialLinkText("hao"));
		Thread.sleep(2000);
		element.click();	
		Thread.sleep(2000);*/
		
		//通过cssSelector查找元素
		/*WebElement element=webDriver.findElement(By.cssSelector("input#kw"));
		String elementAtrr=element.getAttribute("autocomplete");
		System.out.println(elementAtrr);*/
		WebElement element=webDriver.findElement(By.cssSelector("input.s_ipt"));
		String elementAtrr=element.getAttribute("autocomplete");
		System.out.println(elementAtrr);
		
		
		webDriver.quit();
	}

}
