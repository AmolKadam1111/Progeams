package annotationpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeSuiteAfterSuite1 {
	@BeforeSuite
	public void mailConfiguration() {
		System.out.println("mail configuired");
	}
	@AfterSuite
	public void mailSent() {
		System.out.println("mail has been sent");
	}
	@BeforeTest
	public void openBrowser() {
		System.out.println("browser opened");
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("browser closed");
	}
	@BeforeClass
	public void login() {
		System.out.println("login");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout");
	}
	
	@Test
	public void notification() {
		System.out.println("check notifications");
	}
	@Test
	public void homepage() {
		System.out.println("check homepage");

}

}



