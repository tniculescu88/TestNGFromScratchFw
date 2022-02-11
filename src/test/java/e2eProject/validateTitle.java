package e2eProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import resources.Base;

public class validateTitle extends Base{
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		WebDriver driver = initialize_driver();
		String url1 = prop.getProperty("url");
		System.out.println(url1);
		driver.get(url1);
	}
	
	@Test()
	public void selTest1() throws IOException
	{


		HomePage home_page = new HomePage(driver);
		AssertJUnit.assertTrue(home_page.get_navBar_webElem().isDisplayed());
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	
	

}
