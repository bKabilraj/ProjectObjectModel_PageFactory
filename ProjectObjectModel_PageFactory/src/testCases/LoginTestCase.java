package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginTestCase {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\new driver\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/login");
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.eMail.sendKeys("user@phptravels.com");
		LoginPageObjects.passWord.sendKeys("demouser");
		LoginPageObjects.loginButton.click();
	}
}
