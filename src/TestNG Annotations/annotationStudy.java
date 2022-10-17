package annotationpractice;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class annotationStudy {
	
	@Test
	public void homepage() {
		//System.out.println("homepage tested");
		Reporter.log("homepage test verified", true);
	}
	@Test
	public void notification() {
		Reporter.log("notification page tested", true);
		Assert.fail();
	}
	

}
