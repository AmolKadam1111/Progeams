package annotationpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterAnnotation {
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	@Test(priority=1)
	public void notification() {
		System.out.println("check notifications");
	}
	@Test(priority=2)
	public void homepage() {
		System.out.println("check homepage");
	}
	@Test(priority=3)
	public void settings() {
		System.out.println("go to settings");
	}


}

	


