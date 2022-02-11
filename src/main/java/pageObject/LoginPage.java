package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By email_locator = By.id("user_email");
	By pwd_locator = By.id("user_password");
	By loginBtn_locator = By.cssSelector("input[class*='login-button']");
	By alert_locator = By.cssSelector("div[class*='alert-danger']");
	
	public WebElement get_email_webElem()
	{
		return driver.findElement(email_locator);
	}
	
	
	public WebElement get_pwd_webElem()
	{
		return driver.findElement(pwd_locator);
	}

	public WebElement get_loginBtn_webElem()
	{
		return driver.findElement(loginBtn_locator);
	}
	
	public WebElement get_alert_webElem()
	{
		return driver.findElement(alert_locator);
	}
	
}
