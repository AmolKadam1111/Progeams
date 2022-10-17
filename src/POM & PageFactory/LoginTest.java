package PomWithPageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	//setup
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91787\\Desktop\\selenium\\105chrome\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterClass
	public void terDown() {
		driver.quit();
	}
	@Test
	public void FacebookLoginPage_PositiveTest() {
		LoginPage lp=new LoginPage(driver);
		lp.VerifyFacebookLoginPageLogo();
		lp.VerifyFacebookLoginPageTagline();
		lp.VerifyFacebookLoginPageForgetPassLink();
		lp.VerifyFacebookLoginPageCreateAccBtn();
		lp.VerifyFacebookLoginPageFooterLinkSize();
		lp.SetFacebookLoginPageEmail("Test@gmail.com");
		lp.SetFacebookLoginPagePassword("Test@123");
		lp.ClickFacebookLoginPageLoginBtn();
		
	}
	
	
	

}
