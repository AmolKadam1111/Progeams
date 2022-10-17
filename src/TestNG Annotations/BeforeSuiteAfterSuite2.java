package annotationpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeSuiteAfterSuite2 {
	@BeforeClass
	public void login() {
		System.out.println("login");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout");
	}
	@Test
	public void settings() {
		System.out.println("go to settings");
	}
	@Test
	public void profilepage() {
		System.out.println("check the profile");
	}
	

}



