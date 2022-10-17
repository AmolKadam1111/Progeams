package TestNgGrouping;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class TestCase3 {
	
	@BeforeClass(alwaysRun=true)
	public void openBrowser() {
		System.out.println("browser opened");
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		System.out.println("browser closed");
	}
	@Test(groups="Smoke")
	public void test7() {
		System.out.println("test7");
	}
	@Test(groups="Functional")
	public void test8() {
		System.out.println("test8");
	}
	@Test(groups= {"Functional","Regression"})
	public void test9() {
		System.out.println("test9");
	}
	
	
	

}
