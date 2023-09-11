package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ValidateFieldsPage;
import baseclass.BaseClass;

public class TC_08_ValidationFields extends BaseClass{
	
	@Test
	public void testValidation() {
		try {
			
			ValidateFieldsPage vfp = new ValidateFieldsPage(driver);
			
			vfp.clickCheckIn();
			Thread.sleep(1000);
			vfp.verifyCheckIn();
			
			vfp.clickFlightStatus();
			Thread.sleep(1000);
			vfp.verifyFightStatus();
			
			vfp.clickManageBooking();
			Thread.sleep(1000);
			vfp.verifyManageBooking();
					
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
