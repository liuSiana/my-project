package com.lemon.day021.section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lemon.day021.section2.BasicClass;

public class WebElementAPITester extends BasicClass{
	/**
	 * 对所定位的元素进行操作
	 * @throws InterruptedException
	 */
	@Test
	public void t() throws InterruptedException {
//		WebElement element=driver.findElement(By.id("kw"));
		//往文本框输入内容
//		element.sendKeys("刘新爱");
		//sendkeys可以进行键盘的操作，参见Keys这个类中的一些方法
//		element.sendKeys(Keys.CONTROL,"a");
//		element.sendKeys(Keys.CONTROL,"c");
//		element.sendKeys(Keys.CONTROL,"v");
//		element.sendKeys(Keys.CONTROL,"v");
//		element.sendKeys(Keys.CONTROL,"v");
		
//		Thread.sleep(2000);
		//清空输入框
//		element.clear();
		
//		element.sendKeys("Siana");
		//点击操作
//		driver.findElement(By.id("su")).click();
		
		//获取要元素的属性值
//		String atrrName=element.getAttribute("maxlength");
//		System.out.println(atrrName);
		
		//获取元素的标签名
//		String tagName=element.getTagName();
//		System.out.println(tagName);
		
		//获取元素的文本内容
//		WebElement ele=driver.findElement(By.cssSelector("a[class='t1']"));
//		System.out.println(ele.getText());
		
//		WebElement element=driver.findElement(By.id("su"));
//		//元素是否显示
//		System.out.println(element.isDisplayed());
//		//元素是否被选中
//		System.out.println(element.isSelected());
//		//元素是否可用
//		System.out.println(element.isEnabled());
		
		//如果是form表单时，可以使用submit进行表单提交
		driver.findElement(By.name("phone")).sendKeys("18210342582");
		driver.findElement(By.name("password")).sendKeys("qwe123");
		driver.findElement(By.cssSelector("input[class='tSub frd']")).submit();
		
	}

}
