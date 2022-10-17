package AssertClassPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertClassExample {
	@Test
	public void m1() {
		SoftAssert sa=new SoftAssert();
		
		String actual="shweta";
		sa.assertEquals(actual, "shinde");
		System.out.println(actual);
		
		String expected="shinde";
		sa.assertEquals(expected, "shinde");
		System.out.println(expected);
		sa.assertAll();
		
		
	}

}
