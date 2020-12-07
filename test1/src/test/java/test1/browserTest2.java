package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserTest2 {
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.gecko.driver",projectPath +"//drivers//geckodriver//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//set the chrome driver path in path environment variable
		//System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chrome/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
	
       System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.selenium.dev/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
	}

}
