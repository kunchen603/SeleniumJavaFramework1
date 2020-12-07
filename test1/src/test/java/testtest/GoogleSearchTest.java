package testtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public  class GoogleSearchTest {
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chrome/chromedriver.exe/");
		driver = new ChromeDriver();
		
	    //go to google.com
		driver.get("https://google.com");
		
	   GoogleSearchPage.textbox_search(driver).sendKeys("automation step by step");
	   GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		//close browser
		driver.close();
		System.out.println("test completed successfullyK");
	}

}
