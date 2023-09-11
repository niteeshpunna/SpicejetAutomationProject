package PageObjects;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePage {
	
	public WebDriver driver;
	
	public ResourceBundle rb = ResourceBundle.getBundle("data") ;

	public basePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

}
