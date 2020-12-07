package listeners;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo {
     @Test
	public void test1()
	{
		System.out.println("i am inside test1");
	}
     @Test
	public void test2()
	{
		System.out.println("i am inside test2");
		String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.gecko.driver",projectPath +"//drivers//geckodriver//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//set the chrome driver path in path environment variable
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		//WebElement textBox = driver.findElement(By.name("q"));
		driver.findElement
		(By.xpath("//input[@name='q']")).sendKeys("abcd");
		driver.findElement
				(By.xpath("//input[@name='abc']")).sendKeys("abcd");
		driver.close();
	}
     @Test
	public void test3()
	{
		System.out.println("i am inside test3");
		throw new SkipException("this test is skipped");
	}
}
