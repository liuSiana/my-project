package com.lemon.day019.section3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * selenium工具类
 * @author liuxinai
 *
 */
public class SeleniumUtil {
/**
 * 打开浏览器
 * @param browserType 浏览器类型
 * @param seleniumVersion selenium版本号
 * @param driverPath driver的路径
 */
	public static void openBrowser(String browserType,String seleniumVersion,String driverPath){
		
//		WebDriver webDriver =null;//面向接口编程
		
		if ("ie".equalsIgnoreCase(browserType)) {
			openIEBrowser(driverPath);
		}
		else if ("FireFox".equalsIgnoreCase(browserType)) {
			openFirefoxBrowser(seleniumVersion, driverPath);
		}
		else if ("Chrome".equalsIgnoreCase(browserType)) {
			openChromeBroser(driverPath);
		}
	}
/**
 * 打开Chrome浏览器
 * @param driverPath chrome的驱动文件
 * @return
 */
	private static WebDriver openChromeBroser(String driverPath) {
		//设置Chrome浏览器可执行文件的路径
		System.setProperty("webdriver.chrome.driver",driverPath);
		// 唤起浏览器,将设置的能力传入参数中
		WebDriver webDriver=new ChromeDriver();
		webDriver.quit();
		return webDriver;
	}
	/**
	 * 打开FireFox浏览器
	 * @param seleniumVersion selenium 版本号
	 * @param driverPath FirFox的可执行文件路径
	 * @return
	 */
	private static WebDriver openFirefoxBrowser(String seleniumVersion, String driverPath) {
				// 唤起浏览器,将设置的能力传入参数中
		//如果是3.x的版本的selenium，需要设置firefox的可执行驱动
		if ("3.x".equalsIgnoreCase(seleniumVersion)) {
			
			System.setProperty("webdriver.gecko.driver",driverPath);
		}
		WebDriver webDriver=new FirefoxDriver();
		webDriver.quit();
		return webDriver;
		
	}
/**
 * 打开IE浏览器
 * @param driverPath IE的驱动文件存放路径
 * @return
 */
	private static WebDriver openIEBrowser(String driverPath) {
		// 设置驱动文件
//			System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
		//通常使用这种方式进行驱动文件的设置
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY,driverPath);
		//设置driver期望的能力
		DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
		//忽略浏览器的缩放比例
		desiredCapabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		//忽略浏览器的安全等级设置
		desiredCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		//设置初始化URL，防止window对象丢失
		desiredCapabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://www.baidu.com");
		// 唤起浏览器,将设置的能力传入参数中
		WebDriver webDriver=new InternetExplorerDriver(desiredCapabilities);
		webDriver.quit();
		return webDriver;
	}
}
