package testtest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtedntReportsDemoWithTEstNG { 
	ExtentReports extent;
	@BeforeSuite
	public void setUp()
	{
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter
				("target/Spark/Spark.html");
		extent.attachReporter(spark);
	}
	@Test
	public void test1()
	{
	  ExtentTest test = extent.createTest("myFirstTestKKK", "sample description");
	  test.pass("text detail");
	  test.log(Status.PASS, "Test detail by Kun");
	  extent.createTest("Devices")
      .assignDevice("TheDevice")
  .pass("This test 'Devices' was assigned by a special kind of devices tag.");
	  extent.createTest("ScreenCapture")
      .addScreenCaptureFromPath("extent.png")
      .pass(MediaEntityBuilder.createScreenCaptureFromPath("extent.png").build());
	  
	}
	@AfterSuite
	public void tearDown()
	{
		extent.flush();
	}

}
