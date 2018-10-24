package CM_POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.presentationml.x2006.main.CmAuthorLstDocument;

import AutomationConstants.CMAutomationConstants;
import CM_Generics.ReadProperties;

public class SF1Login_Page implements CMAutomationConstants
{
	 private WebDriver driver;
	 
	 @FindBy(xpath="//input[@id='username']")
	 private WebElement username;
	 
	 @FindBy(xpath="//input[@id='password']")
	 private WebElement password;
	 
	 @FindBy(xpath="//input[@id='Login']")
	 private WebElement loginbutton;
	 
	 public SF1Login_Page(WebDriver driver)
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 public void SFlogin(String un, String pw)
	   {
		// username.sendKeys(ReadProperties.getPropValue(CMAutomationConstants.propfilepath, "un"));
		// password.sendKeys(ReadProperties.getPropValue(CMAutomationConstants.propfilepath, "pw"));
		 
		 username.sendKeys(un);
		 password.sendKeys(pw);
		 loginbutton.click();
	   }
}
