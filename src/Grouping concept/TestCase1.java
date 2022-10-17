package TestNgGrouping;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	@BeforeTest(alwaysRun=true)
	public void openDB() {
		System.out.println("database open");
	}
	@AfterTest(alwaysRun=true)
	public void closeDB() {
		System.out.println("database closed");
	}
	@BeforeClass(alwaysRun=true)
	public void openBrowser() {
		System.out.println("browser opened");
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		System.out.println("browser closed");
	}
	@Test(groups="Smoke")
	public void test1() {
		System.out.println("test1");
	}
	@Test(groups="Functional")
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups= {"Functional","Regression"})
	public void test3() {
		System.out.println("test3");
	}
	
}
