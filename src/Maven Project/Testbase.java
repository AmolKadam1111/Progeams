package com.projectname.qa.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Testbase {

	
	public static WebDriver driver;
	public void InitilizeBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91787\\Desktop\\selenium\\105chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		     driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\91787\\Desktop\\selenium\\gecko\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		     driver=new FirefoxDriver();
		}else {
			System.out.println("wrong browser ");
		}
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

}
