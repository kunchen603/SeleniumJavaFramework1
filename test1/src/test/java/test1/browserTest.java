package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserTest {
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.gecko.driver",projectPath +"//drivers//geckodriver//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//set the chrome driver path in path environment variable
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		//WebElement textBox = driver.findElement(By.name("q"));
		WebElement textBox = driver.findElement
				(By.xpath("//input[@name='q']"));
		
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.println("count of input element:"+count);
				textBox.sendKeys("automation step by step");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
	}

}
