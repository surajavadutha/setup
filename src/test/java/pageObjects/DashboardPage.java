package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage
{

	public DashboardPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "(//a)[1]/p")
	WebElement msgDash;
	
	public boolean isDashboardexists() {
		try {
			return msgDash.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}

}
