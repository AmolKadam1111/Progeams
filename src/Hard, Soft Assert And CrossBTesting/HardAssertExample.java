package AssertClassPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
	@Test
	public void m1() {
		String actual="shweta";
		String expected="shinde";
		Assert.assertEquals(actual, expected);
		
	}
	@Test
	public void m2() {
		String actual="shweta";
		String expected="shinde";
		Assert.assertNotEquals(actual, expected);
		
	}
	@Test
	public void m3() {
		String actual="shweta";
		Assert.assertNull(actual);
		
	}
	@Test
	public void m4() {
		String actual="shweta";
		Assert.assertNotNull(actual);
		
	}
	@Test
	public void m6() {
		String actual="shweta";
		Assert.fail();
		
	}
	
	

}
