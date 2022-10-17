package AssertClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingExample {
	WebDriver driver;
	@Parameters("browser")
	@Test(priority=1)
	public void CrossBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91787\\Desktop\\selenium\\105chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		     driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\91787\\Desktop\\selenium\\gecko\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		     driver=new FirefoxDriver();
		}else {
			System.out.println("wrong browser ");
		}
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	}
	@Test(priority=2)
	public void VerifyCurrentUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/login/");
		
	}
	@Test (priority=2)
	public void VerifygetTitle() {
		Assert.assertEquals(driver.getTitle(), "Log in to Facebook");
	}
	@Test(priority=3)
	public void VerifyUsername() {
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("abc");
	}
	@Test(priority=4)
	public void VerifyPassword() {
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		Assert.assertTrue(pass.isDisplayed());
		pass.sendKeys("123");
	}
	@Test(priority=5)
	public void VerifyClickOnLogin() {
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		Assert.assertTrue(loginbtn.isEnabled());
		loginbtn.click();
	}

}
