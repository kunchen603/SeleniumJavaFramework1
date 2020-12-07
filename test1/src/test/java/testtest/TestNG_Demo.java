package testtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNG_Demo {
	
	WebDriver driver = null;
	public static String browserName=null;
	@BeforeTest
	public void setUpTest()
	{
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chrome/chromedriver.exe/");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",projectPath +"//drivers//geckodriver//geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		
	
		
	}
	@Test
	public void googleSearch() {
		
	    //go to google.com
		driver.get("https://google.com");
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("automation step by step");
	   //click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	}
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("test completed successfullyby KDemo1");
		PropertiesFile.setProperties();
	}

}
