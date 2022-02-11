package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By login_locator = By.linkText("Login");
	By navBar_locator = By.cssSelector("nav[class*='navbar-collapse']");

	public WebElement get_Login_webElem()
	{
		return driver.findElement(login_locator);
	}

	public WebElement get_navBar_webElem()
	{
		return driver.findElement(navBar_locator);
	}
	
	
}
