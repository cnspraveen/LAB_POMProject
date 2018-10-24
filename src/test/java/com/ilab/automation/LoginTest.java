package com.ilab.automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AutomationConstants.CMAutomationConstants;
import CM_Generics.ReadProperties;
import CM_POMPages.SF1Login_Page;
import CM_POMPages.SF2AllowAccess_Page;
import CM_POMPages.SF3Dashboard_Page;
import CM_POMPages.SF5ProfilePage;
import CM_POMPages.SFBasePage;

public class LoginTest extends SuperNG
{
	@Test
	public void loginpage_test() throws InterruptedException
	{ 
		SF1Login_Page login = new SF1Login_Page (driver);
		login.SFlogin(ReadProperties.getPropValue(CMAutomationConstants.propfilepath, "un"), ReadProperties.getPropValue(CMAutomationConstants.propfilepath, "pw"));	
		SF2AllowAccess_Page access = new SF2AllowAccess_Page(driver);
		access.allowAccess();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		SF3Dashboard_Page logout = new SF3Dashboard_Page(driver);
//		logout.logout();
		SFBasePage bp = new SFBasePage(driver);
		bp.profile(); 
	
        SF5ProfilePage profilePage = new SF5ProfilePage(driver);
	//profilePage.toggleEmailNotfication();
		Thread.sleep(5000);
		profilePage.favouriteProfile();
   	}
}
