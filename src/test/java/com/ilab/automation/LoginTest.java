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
import CM_POMPages.SF6DedicatedQuickLinks_Page;
import CM_POMPages.SFBasePage;

public class LoginTest extends SuperNG
{
	@Test
	public void loginpage_test() throws InterruptedException
	{ 
	//Login to Salesforce
		SF1Login_Page login = new SF1Login_Page (driver);
		login.SFlogin(ReadProperties.getPropValue(CMAutomationConstants.propfilepath, "un"), ReadProperties.getPropValue(CMAutomationConstants.propfilepath, "pw"));	
	//Auth page for authentication.
		SF2AllowAccess_Page access = new SF2AllowAccess_Page(driver);
		access.allowAccess();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		SF3Dashboard_Page logout = new SF3Dashboard_Page(driver);
//		logout.logout();
        //Base Page which has features/functionalities that are sticky/visible in all the pages such as features comes in headers and Footers       
		SFBasePage bp = new SFBasePage(driver);
		bp.profile(); 
	//Navigate to profile page
	SF5ProfilePage profilePage = new SF5ProfilePage(driver);
	//Profile->Preference page where user toggles the email notfication button(option) to enable/disable 
        //profilePage.toggleEmailNotfication();
		Thread.sleep(5000);
	//Favourite the Profile page
	profilePage.favouriteProfile();
	Thread.sleep(5000);
	bp.quickLinksOption();
	
	SF6DedicatedQuickLinks_Page dedicatequicklink = new SF6DedicatedQuickLinks_Page(driver);
	dedicatequicklink.booksMarksTab();
	Thread.sleep(3000);
	//dedicatequicklink.nameExistInQuickLinks();
	System.out.println("ActualquicklinksName : " + dedicatequicklink.nameExistInQuickLinks());
	ReadProperties genericMethod = new ReadProperties();
	genericMethod.assertCheck(ReadProperties.getPropValue(CMAutomationConstants.propfilepath, "profileNameInQuicklinkspage"), dedicatequicklink.nameExistInQuickLinks());
    
	}
}
