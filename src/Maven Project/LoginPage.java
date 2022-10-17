package com.projectname.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.projectname.qa.Base.Testbase;

public class LoginPage extends Testbase {
	//Declaration
	@FindBy(xpath="//img[@alt='Facebook']")private WebElement login_fblogo;
	@FindBy(xpath="//h2[text()='Facebook helps you connect and share with the people in your life.']") private WebElement login_fbtag;
	@FindBy(xpath="//a[text()='Forgotten password?']") private WebElement login_forgetPass;
	@FindBy(xpath="//a[text()='Create New Account']") private WebElement login_createnewacc;
	@FindBy(xpath="//input[@name='email']") private WebElement login_EmailPhn;
	@FindBy(xpath="//input[@name='pass']") private WebElement login_Pass;
	@FindBy(xpath="//button[@name='login']") private WebElement login_button;
	@FindBys({@FindBy(xpath="//div[@id='pageFooterChildren']//li")}) private List<WebElement> login_footerlinks;
	
	//initilization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void VerifyFacebookLoginPageLogo() {
		Assert.assertTrue(login_fblogo.isDisplayed(), "Facebook logo on login page is not displayed");
		Reporter.log("Verify facebook login page logo", true);
		
	}
	public void VerifyFacebookLoginPageForgetPassLink() {
		Assert.assertTrue(login_forgetPass.isDisplayed(),"Facebook login page forget password link is not displayed");
	    Assert.assertEquals(login_forgetPass.getText(),"Forgotten password?");
	    Reporter.log("Verify facebook login page forget password link",true);
	}
	public void VerifyFacebookLoginPageCreateAccBtn() {
		Assert.assertTrue(login_createnewacc.isDisplayed(),"facebook login page create acc btn is not displayed");
	    Assert.assertTrue(login_createnewacc.isEnabled(), "facebook login page create acc button is disabled");
	    Assert.assertEquals(login_createnewacc.getText(), "Create New Account");
	    Reporter.log("Verify facebook login page create account button",true);
	}
	
	public void VerifyFacebookLoginPageTagline() {
		Assert.assertTrue(login_fbtag.isDisplayed(),"Facebook login page tagline is not displayed");
		Assert.assertEquals(login_fbtag.getText(), "Facebook helps you connect and share with the people in your life.");
	    Reporter.log("Verify facebook login page tagline",true);
	}
	public void SetFacebookLoginPageEmail(String em) {
		Assert.assertTrue(login_EmailPhn.isDisplayed(),"Email Id field is not displayed");
		login_EmailPhn.sendKeys(em);
		Reporter.log("Set facebook login page emailid field",true);
	}
	public void SetFacebookLoginPagePassword(String pass) {
		Assert.assertTrue(login_Pass.isDisplayed(),"Facebook login page password field is not displayed");
		login_Pass.sendKeys(pass);
		Reporter.log("Set facebook login page password field",true);
	}
	public void ClickFacebookLoginPageLoginBtn() {
		Assert.assertTrue(login_button.isDisplayed(),"facebook login page Login Button is not displayed");
		Assert.assertTrue(login_button.isEnabled(),"facebook login page Login button is not enabled");
		login_button.click();
		Reporter.log("Click facebook login page button",true);
	}
	public void VerifyFacebookLoginPageFooterLinkSize() {
		Assert.assertEquals(login_footerlinks.size(),31);
		Reporter.log("verify facebook login page footer link");
	}
	
	
	

}
