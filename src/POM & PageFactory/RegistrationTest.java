package PomWithPageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest { //method call and test cases
	//browser setup validations apply browser close
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91787\\Desktop\\selenium\\105chrome\\chromedriver_win32 (1)\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	} 
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void FacebookRegistrationPageTest_Positive() {
		RegistrationPage rp=new RegistrationPage(driver);
		rp.ClickFacebookSignUpLink();
		rp.VerifyFacebookRegistrationPageFacebookLogo();
		rp.VerifyFacebookRegistrationPageAlreadAccount();
		rp.SetFacebookRegistrationPageFirstName("shami");
		rp.SetFacebookRegistrationPageLastName("lnmo");
		rp.SetFaceboodRegistrationPageEmail("abc@gmail.com");
		rp.ReenterFacebookRegistrationPageEmail("abc@gmail.com");
		rp.SetFacebookRegistrationPagePassword("Test@123");
		rp.SetFacebookRegistrationPageBirthdate();
		rp.SetFacebookRegistrationPageBirthmonth();
		rp.SetFaceboodRegistrationPageBirthYear();
		rp.SetFaceboodRegistrationPageGender("male");
		rp.ClickFacebookRegistrationPageSubmitBtn();
	}
	

}
