package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddonsPage extends basePage{

	public AddonsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@data-testid='add-ons-continue-footer-button']")
	WebElement continuebutton;
	public void clickContinue() {
		continuebutton.click();
	}
	
	

}
