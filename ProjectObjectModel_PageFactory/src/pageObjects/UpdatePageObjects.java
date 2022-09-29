package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatePageObjects {

	@FindBy(xpath="//*[@id=\'fadein\']/div[4]/div/div[3]/ul/li[4]/a")
	public static WebElement myProfile;
	
	@FindBy(name="phone")
	public static WebElement phoneNo;
	
	@FindBy(name="city")
	public static WebElement cityName;
	
	@FindBy(xpath="//*[@id=\'fadein\']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
	public static WebElement updateProfileButton;
	
	
}
