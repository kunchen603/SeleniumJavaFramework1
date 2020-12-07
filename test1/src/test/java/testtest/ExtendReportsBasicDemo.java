package testtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportsBasicDemo {
    static WebDriver driver =null;
	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		
		ExtentTest test1 = extent.createTest("MyFirstTest")
		  .log(Status.INFO, "starting test cases");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chrome/chromedriver.exe/");
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		test1.pass("navigate to google.com");
		driver.findElement(By.name("q")).sendKeys("automation");
	    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("pressed keyboard enter key");
		driver.close();
		driver.quit();
	    test1.pass("closed the browser");
	    test1.info("test completed");
		extent.flush();

	}

}
