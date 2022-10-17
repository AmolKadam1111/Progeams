package com.projectname.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.Testbase;
import com.projectname.qa.pages.RegistrationPage;

public class RegistrationTest extends Testbase{ //method call and test cases
	//browser setup validations apply browser close
	
	@BeforeClass
	public void setup() {
		InitilizeBrowser("chrome");
	} 
	@AfterClass
	public void tearDown() {
		Testbase.driver.quit();
	}
	@Test
	public void FacebookRegistrationPageTest_Positive() {
		RegistrationPage rp=new RegistrationPage(Testbase.driver);
		
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
