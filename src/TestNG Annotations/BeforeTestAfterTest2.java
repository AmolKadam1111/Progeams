package annotationpractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeTestAfterTest2 {
	@BeforeClass
	public void login() {
		Reporter.log("login",true);
	}
@AfterClass
public void logout() {
	Reporter.log("logout",true);
}
@Test
public void m3() {
	Reporter.log("method3",true);
}
@Test
public void m4() {
	Reporter.log("method4",true);
}



}
