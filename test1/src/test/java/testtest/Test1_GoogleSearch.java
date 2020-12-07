package testtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Test1_GoogleSearch {
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chrome/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		
	    //go to google.com
		driver.get("https://google.com");
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("automation step by step");
	   //click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//close browser
		driver.close();
		System.out.println("test completed successfullyKun");
	}

}
