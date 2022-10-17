package annotationpractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAfterTest1 {
	@BeforeTest
	public void browserLaunch() {
		System.out.println("launch the browser");
	}
	@AfterTest
	public void browserclose() {
		System.out.println("launch the browser");
	}
	@BeforeClass
		public void login() {
			Reporter.log("login",true);
		}
	@AfterClass
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test
	public void m1() {
		Reporter.log("method1",true);
	}
	@Test
	public void m2() {
		Reporter.log("method2",true);
	}
	
	
	

}
