package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider {
	WebDriver driver = null;
	@BeforeTest
	public void setUpTest()
	{
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chrome/chromedriver.exe/");
			driver = new ChromeDriver();
			
	}
	
		@Test(dataProvider = "test1data")
		public void test1(String username, String password) throws Exception {
		System.out.println(username+"|"+password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		Thread.sleep(2000);
		
		}
		
	
	@DataProvider(name = "test1data")
	public  Object[][] getData()
	{
		String excelPath="C:\\Users\\ckun_\\eclipse-workspace1\\test1\\excel\\data.xlsx";
		Object data[][]= testData(excelPath, "sheet1");
		return data;
	}
	public  Object[][] testData(String excelPath, String sheetName)
	{
		ExcelUtilis excel = new ExcelUtilis(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][]= new Object[rowCount-1][colCount];
		String cellData=null;
		for(int i=1; i<rowCount; i++)
		{
			for(int j=0; j<colCount;j++)
			{
				
				cellData = excel.getCellDataString(i, j);
				System.out.print(cellData +"|");
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		return data;
	}
}
