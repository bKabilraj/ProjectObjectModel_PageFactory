package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {

	@FindBy(how=How.NAME, using="email")
	public static WebElement eMail;
	
	@FindBy(name="password" )
	public static WebElement passWord;
	
	@FindBy(xpath="//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement loginButton;
}
