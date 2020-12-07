package testtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
     public static void main(String[] args) {
	GoogleSearchTest();
}
     
     public static void GoogleSearchTest()
     {
    	String projectPath = System.getProperty("user.dir");
 		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chrome/chromedriver.exe/");
 		driver = new ChromeDriver();
 		
 		GoogleSearchPageObjects searchPageObj = 
 				new GoogleSearchPageObjects(driver);
 		driver.get("https://google.com");
 		searchPageObj.setTextInSearchBox("Automation step by step");
 		searchPageObj.clickSearchButton();
 		driver.close();
     }
     
}
