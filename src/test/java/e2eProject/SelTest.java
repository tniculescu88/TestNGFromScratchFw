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

public class SelTest extends Base{
	
	
	@BeforeTest
	public void initialization() throws IOException
	{
		WebDriver driver = initialize_driver();
		driver.get("http://www.qaclickacademy.com/");
	}
	
	@Test(dataProvider="getData")
	public void selTest1(String username, String pwd) throws IOException, InterruptedException
	{

		HomePage home_page = new HomePage(driver);
		LoginPage login_page = new LoginPage(driver);
		// go to login
		home_page.get_Login_webElem().click();
		Thread.sleep(1000);
		// insert username and passwd, and click login
		login_page.get_email_webElem().sendKeys(username);
		Thread.sleep(1000);
		login_page.get_pwd_webElem().sendKeys(pwd);
		Thread.sleep(1000);
		login_page.get_loginBtn_webElem().click();
		Thread.sleep(1000);
		login_page.get_loginBtn_webElem().click();
		String actualString = login_page.get_alert_webElem().getText();
		AssertJUnit.assertEquals("Invalid email or password.",actualString );
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination username password
		//2nd - username password
		Object[][] data = new Object[1][2];
		data[0][0] = "firstusername@email.com";
		data[0][1] = "firstpassword";
		//data[1][0] = "secondusername@email.com";
		//data[1][1] = "secondpwd";
		//data[2][0] = "thirduseername@email.com";
		//data[2][1] = "thirdpwd";
		
		return data;
				
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
