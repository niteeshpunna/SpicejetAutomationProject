package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.FlightsPage;
import PageObjects.HomePage;
import baseclass.BaseClass;

public class TC_04_OnewayFlightSearch extends BaseClass{

	@Test
	public void onewaySearchFlight() {
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
			
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
}
