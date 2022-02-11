package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initialize_driver() throws IOException
	{
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/tudor.niculescu/eclipse-workspace/E2EProject/src/main/java/resources/data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/tudor.niculescu/pyTraining/chromedriver");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			System.out.println("Firefox");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	
	}

}
