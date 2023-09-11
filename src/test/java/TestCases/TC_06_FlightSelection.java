package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AddonsPage;
import PageObjects.FlightsPage;
import PageObjects.HomePage;
import PageObjects.PassengersPage;
import PageObjects.PaymentsPage;
import baseclass.BaseClass;

public class TC_06_FlightSelection extends BaseClass{
	
	@Test
	public void testFlightSelection() {
		try {
			//Creating object to Homepage
			HomePage hp = new HomePage(driver);
			
			hp.clickOneway(); //Click on OneWay Button
			
			hp.enterOrigin(rb.getString("origin")); //Enter Origin
			
			hp.enterDestination(rb.getString("destination")); //Enter destination
			
			hp.clickDepartureDate(); //Click on departure date
			Thread.sleep(1000);
			
			hp.selectDate(); //Select the date
			
			hp.clickSearchFlight(); //Click on SearchFlight 
			
			//Thread.sleep(2000);
			
			//Creating object to BookingPage
			FlightsPage fp = new FlightsPage(driver);
			
			fp.verifyModifySearch(); //Verify the Modify Search element 
			Thread.sleep(2000);
			//fp.clickSpiceFlexButton();
			
			//fp.clickFirstFlight();
			
			//fp.clickSpicesaverButton();
			
			//Thread.sleep(1000);
			fp.clickContinue();
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
