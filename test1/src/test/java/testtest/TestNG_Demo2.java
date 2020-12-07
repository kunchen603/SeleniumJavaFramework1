package testtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chrome/chromedriver.exe/");
		driver = new ChromeDriver();
		
	}
	@Test
	public void googleSearch2() {
		
	    //go to google.com
		driver.get("https://google.com");
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("automation step by step");
	   //click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	}
	
	@Test
public void googleSearch3() {
		
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
		System.out.println("test completed successfullybyKDemo2");
	}

}
