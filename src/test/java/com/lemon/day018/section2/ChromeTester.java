package com.lemon.day018.section2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTester {
	@Test
	public void f() {
		System.setProperty("webdiver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}
}
