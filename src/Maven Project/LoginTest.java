package com.projectname.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.Testbase;
import com.projectname.qa.pages.LoginPage;

public class LoginTest extends Testbase {
	//setup
	
	@BeforeClass
	public void setup() {
		InitilizeBrowser("chrome");
	}
	@AfterClass
	public void tearDown() {
		Testbase.driver.quit();
	}
	@Test
	public void FacebookLoginPage_PositiveTest() {
		LoginPage lp=new LoginPage(Testbase.driver);
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
