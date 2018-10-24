package com.ilab.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import AutomationConstants.CMAutomationConstants;
import CM_Generics.ReadProperties;

public class SuperNG implements CMAutomationConstants
{
	public WebDriver driver;
  
/*	@BeforeClass
	public void preCondition() throws EncryptedDocumentException, InvalidFormatException, IOException
   {
	   String xlpath = "./Input_Files/Excel/InputData.xlsx";
	   String sheetname = "login";
int rc=Excel_Transactions.getRowCount(xlpath, sheetname);
for(int i=1;i<=rc;i++)
{
	 String browser = Excel_Transactions.getCellValue(xlpath, sheetname, i, 0);
	 if(browser.equalsIgnoreCase("chrome")){
		   System.setProperty("webdriver.chrome.driver", "./ExeFiles/chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   Reporter.log("chrome is launched", true);}
	 //	Error:  Starting ChromeDriver (v2.10.267521) on port 33065.Only local connections are allowed.

	else 
		if(browser.equalsIgnoreCase("ie")){
		   System.setProperty("webdriver.ie.driver", "./ExeFiles/IEDriverServer.exe");
	       driver = new InternetExplorerDriver();
	       driver.manage().window().maximize();
	       Reporter.log("IE is launched", true);}
	else 
		if(browser.equalsIgnoreCase("MozillaFirefox"))
		{
		//System.setProperty("WebDriver.firefox.profile", "default");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Reporter.log("mozilla is launched", true);}
	
		else{
		//System.setProperty("WebDriver.firefox.profile", "default");
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		Reporter.log("mozilla is launched", true);}
	  
	 
	 
	 String Url = Excel_Transactions.getCellValue(xlpath, sheetname, i, 1);
	 driver.get(Url);
	 Reporter.log("opening URL", true);
	 driver.manage().timeouts().implicitlyWait(111, TimeUnit.SECONDS);
} 
Excel_Transactions.properties();
Excel_Transactions.read_propertiesfile(); 
//
//Excel_Transactions.properties();
//Excel_Transactions.read_propertiesfile();

//Excel_Transactions.DBConnection("rootone", "password", "show databases", "use sample", "insert into master values(3,'RajuUncle','rajshekar@gmail.com','9900211731','bellary','220000'", "insert into master values(4,'Vishnu','Vishnu@gmail.com','666666','tpty','240000'", "select * from master");

	
String csvfile = "C:/Praveen/Eclips_Workspace/Healthcare_Automation/Input_Files/csv/CSVInputfile.csv";
Excel_Transactions.csvfilereader(csvfile); 
   }
*/	

	@BeforeTest
	public void browerLaunch()
	{
	System.setProperty(CMAutomationConstants.driverType, CMAutomationConstants.browserTypeDriverPath);
	driver = new ChromeDriver();
	String url1 = CMAutomationConstants.url;
	driver.get(url1);
	driver.manage().timeouts().implicitlyWait(CMAutomationConstants.time, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void browserClose()
	{
	 driver.close();	
	}
	
	
			//@AfterClass
		/*public void postcondition()
		{
			driver.quit();
		} */
	}

