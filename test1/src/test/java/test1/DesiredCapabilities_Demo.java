package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		//DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("ignoreProtectedModeSettings", true);
		//caps.setCapability(capabilityName, value);

		System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		
		InternetExplorerOptions options = new InternetExplorerOptions();
	    options.setCapability("ignoreProtectedModeSettings", true);
	    options.setCapability("ignoreZoomSetting", true);
		WebDriver driver = new InternetExplorerDriver(options);
		//ChromeOptions options = new ChromeOptions();
		//options.setCapability("capability_name", "capability_value");
		//driver = new ChromeDriver(options);
		
	
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("automation step by step");
		
		driver.findElement(By.name("ktnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();

	}

}
