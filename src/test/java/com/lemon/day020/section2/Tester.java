package com.lemon.day020.section2;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Tester {

	@Test
//	此处是从xml文件中的参数进行注入，此处设置的参数与xml文件中的参数一一对应，与方法中设置的参数也是一一对应
	@Parameters(value={"browserType","seleniumVersion","driverPath"})
	public static void t(String browserType,String seleniumVersion,String driverPath){
		WebDriver driver=SeleniumUtil.openBrowser(browserType, seleniumVersion, driverPath);
		driver.get("http://www.baidu.com");
		//使用id定位元素
//		WebElement element=driver.findElement(By.id("kw"));
//		String actual=element.getAttribute("autocomplete");
//		assertEquals(actual, "off");
		
		//使用name定位元素
//		WebElement element=driver.findElement(By.name("wd"));
//		String actual=element.getAttribute("autocomplete");
//		assertEquals(actual, "off");
		
		//使用className定位元素
//		WebElement element=driver.findElement(By.className("s_ipt"));
//		String actual=element.getAttribute("autocomplete");
//		assertEquals(actual, "off");
		
		//使用tagName定位元素
//		List<WebElement> elements=driver.findElements(By.tagName("input"));
//		for (WebElement webElement : elements) {
//			String actule=webElement.getAttribute("autocomplete");
//			System.out.println(actule);
//		}
		//使用linktext定位元素
//		WebElement element=driver.findElement(By.linkText("新闻"));
//		element.click();
		//使用partialLinkTxt定位元素
//		WebElement element=driver.findElement(By.partialLinkText("hao12"));
//		element.click();
		
		/**
		 * 非常重要！！！！！
		 * 使用cssSelector定位元素
		 * 根据元素属性，属性名=属性值，id、class，等都可以写成这种形式
		 * By.cssSelector("标签名[属性名='属性值']")
		 * 
		 */
		driver.findElement(By.cssSelector("a[href='http://news.baidu.com']")).click();
		
				
		
		driver.quit();
	}
}
