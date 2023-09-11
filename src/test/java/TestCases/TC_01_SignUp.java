package TestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SignupPage;
import baseclass.BaseClass;

public class TC_01_SignUp extends BaseClass{
	
	/*
	@Test(priority=1)
	public void testSignup() {
		try {
						
			HomePage hp = new HomePage(driver);
			hp.clickSignup();

			Set<String> windowIDs = driver.getWindowHandles();
			List<String> windowIDsList = new ArrayList<String>(windowIDs);
			
			String parentWindow = windowIDsList.get(0);
			String currentWindow = windowIDsList.get(1);
			
			driver.switchTo().window(currentWindow);
			
					Thread.sleep(1500);
			
			// Creating object to SignupPage
			SignupPage sp = new SignupPage(driver);
			
			//Select MR as a Title
			sp.selectTitle(rb.getString("title")); 

			//Enter Firstname
			sp.enterFirstName(rb.getString("firstname")); 
			
			//Enter Lastname
			sp.enterLastName(rb.getString("lastname"));	
			
			//Select INDIA as country
			sp.selectCountry(rb.getString("country"));	
			
			//Enter Date of Birth
			sp.enterDOB(rb.getString("DOB")); 
			
			//Enter mobile number
			sp.enterMobileNumber(rb.getString("mobile")); 
			
			//Enter email ID
			sp.enterEmailID(rb.getString("email"));
			
			//Enter new password
			sp.enterNewPassword(rb.getString("newpassword"));
			
			//Enter Confirm password
			sp.enterConfirmPassword(rb.getString("confirmpassword"));
			
			//Click signIn button
			sp.clickSignin();
			
			Thread.sleep(2000);
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	*/
	@Test(priority=2)
	public void testInvalidSignup() {
		try {
			
			
			HomePage hp = new HomePage(driver);
			hp.clickSignup();

			Set<String> windowIDs = driver.getWindowHandles();
			List<String> windowIDsList = new ArrayList<String>(windowIDs);
			
			String parentWindow = windowIDsList.get(0);
			String currentWindow = windowIDsList.get(1);
			
			driver.switchTo().window(currentWindow);
			
					Thread.sleep(1500);
			
			// Creating object to SignupPage
			SignupPage sp = new SignupPage(driver);
			
			//Select MR as a Title
			sp.selectTitle(rb.getString("title")); 

			//Enter Firstname
			sp.enterFirstName(rb.getString("firstname")); 
			
			//Enter Lastname
			sp.enterLastName(rb.getString("empty"));	
			
			//Select INDIA as country
			sp.selectCountry(rb.getString("country"));	
			
			//Enter Date of Birth
			sp.enterDOB(rb.getString("DOB")); 
			
			//Enter mobile number
			sp.enterMobileNumber(rb.getString("mobile")); 
			
			//Enter email ID
			sp.enterEmailID(rb.getString("email"));
			
			//Enter new password
			sp.enterNewPassword(rb.getString("newpassword"));
			
			//Enter Confirm password
			sp.enterConfirmPassword(rb.getString("confirmpassword"));
			
			//Click signIn button
			sp.clickSignin();
			Thread.sleep(1000);
			
			//Verify Error message
			sp.verifyErrorMessage();
			
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
