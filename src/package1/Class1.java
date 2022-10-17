package package1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {

	@AfterMethod
	public void LogoutFunctionality() {
		System.out.println("Loged out");
	}
	@BeforeMethod
	public void LoginFunctionality() {
		System.out.println("Loged In");
	}
	@Test
	public void HomepageTest() {
		System.out.println("Homepage Test is passed");
	}
	@Test
	public void NotificationPageTest() {
		System.out.println("NotificationPage Test is passed");
	}
	@Test
	public void ProfilePageTest() {
		System.out.println("ProfilePage Test is passed");
	}
	
}
