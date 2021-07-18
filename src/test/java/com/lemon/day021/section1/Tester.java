package com.lemon.day021.section1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tester extends BasicClass{

	@Test
	public static void t(){
		//绝对路径
//		driver.findElement(By.xpath("/html/body/div/ul/li/a")).click();
//		相对路径
//		driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/form/div[1]/input")).sendKeys("18210342582");
		//通过元素名+索引进行定位
		//找到元素的相对xpath，想一想在当前页面上，定位的元素父节点哪些是不容易变化的，取最小粒度的相对路径
//		driver.findElement(By.xpath("//*[form/div[1]/input]")).sendKeys("18210342582");
		//使用属性名+元素名
//		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("18210342582");
		//使用元素（html元素---》标签）名+包含部分属性值
		//*[contains(@name,'one')]
//		driver.findElement(By.xpath("//*[contains(@name,'one')]")).sendKeys("11");
		//使用元素名+元素文本的内容
		//*[text()='免费注册'] 获取免费注册超链接，注意空格
//		driver.findElement(By.xpath("//*[text()='没有账号？立即注册']")).click();
		//使用元素名+包含元素的部分文本内容
		//*[contains(text(),'注册')]
		driver.findElement(By.xpath("//*[contains(text(),'没有账号？')]")).click();
		
	}
}
