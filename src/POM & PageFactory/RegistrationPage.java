package PomWithPageFactoryPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage {
	//declaration
	//everything binded at one place
	@FindBy(xpath="//img[@class='fb_logo _registrationPage__fbLogo img']")private WebElement reg_fblogo;
	@FindBy(xpath="//a[text()='Already have an account?']")private WebElement already_acc;
	@FindBy(xpath="//a[text()='Sign Up']")private WebElement signup_link;
	@FindBy(name="firstname")private WebElement firstname;
	@FindBy(xpath="//input[@aria-label='Surname']")private WebElement surname;
	@FindBy(name="reg_email__")private WebElement mob_email;
	@FindBy(xpath="//input[@aria-label='Re-enter email address']")private WebElement Reenter_email;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="//select[@name='birthday_day']")private WebElement birthday;
	@FindBy(xpath="//select[@name='birthday_month']")private WebElement birthmonth;
	@FindBy(xpath="//select[@name='birthday_year']")private WebElement birthyear;
	@FindBy(xpath="//input[@value='2']")private WebElement male;
	@FindBy(xpath="//input[@value='1']")private WebElement female;
	@FindBy(xpath="//input[@value='-1']")private WebElement custom;
	@FindBy(xpath="//button[@type='submit']")private WebElement signup_btn;
	
	//intilization using constructor
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void ClickFacebookSignUpLink() {
		signup_link.click();
	}
	public void VerifyFacebookRegistrationPageFacebookLogo() {
		Assert.assertTrue(reg_fblogo.isDisplayed(), "the Registration page Facebook logo is not displayed");
	}
	public void VerifyFacebookRegistrationPageAlreadAccount() {
		Assert.assertTrue(already_acc.isEnabled(), "Already have an account option on Registration page in not displayed");
	    Assert.assertEquals(already_acc.getText(), "Already have an account?");
	}
	public void SetFacebookRegistrationPageFirstName(String fn) {
		firstname.sendKeys(fn);
	}
	public void SetFacebookRegistrationPageLastName(String ln) {
		surname.sendKeys(ln);
	}
	public void SetFaceboodRegistrationPageEmail(String ei) {
		mob_email.sendKeys(ei);
	}
	public void ReenterFacebookRegistrationPageEmail(String re) {
		Reenter_email.sendKeys(re);
	}
	public void SetFacebookRegistrationPagePassword(String pass) {
		password.sendKeys(pass);
	}
	public void SetFacebookRegistrationPageBirthdate() {
		Select bday=new Select(birthday);
		Assert.assertTrue(birthday.isDisplayed(), "Birthday dropdown is not available on website");;
		Assert.assertFalse(birthday.isSelected(),"The birthdate is selected initially");
		bday.selectByVisibleText("19");
	}
	public void SetFacebookRegistrationPageBirthmonth() {
		Select bmonth=new Select(birthmonth);
		Assert.assertTrue(birthmonth.isDisplayed(), "birthmonth dropdown is not available on website");
	    Assert.assertFalse(birthmonth.isSelected(),"the birthmonth is selected initially");
	    bmonth.selectByVisibleText("Mar");
	}
	public void SetFaceboodRegistrationPageBirthYear() {
		Select byear=new Select(birthyear);
		Assert.assertTrue(birthyear.isDisplayed(),"the birtyear dropdown is not displayed on website");
	    Assert.assertFalse(birthyear.isSelected(),"birthyear is seleced initially");
	    byear.selectByVisibleText("1996");
	}
	public void SetFaceboodRegistrationPageGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			female.click();
			
		}else {
			custom.click();
		}
	}
	public void ClickFacebookRegistrationPageSubmitBtn() {
		signup_btn.click();
	}
	

}
