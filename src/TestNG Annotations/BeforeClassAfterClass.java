package annotationpractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAfterClass {
	@BeforeClass
	public void login() {
		Reporter.log("logged in an app", true);
	}
	@AfterClass
	public void logout() {
		Reporter.log("logged out of app", true);
	}
	@Test(priority=1)
	public void homepage() {
		Reporter.log("tested homepage", true);
	}
	@Test(priority=3)
	public void profilepage() {
		Reporter.log("tested profile page", true);
	}
	@Test(priority=-7)
	public void notification() {
		Reporter.log("tested notifications", true);
	}

}
