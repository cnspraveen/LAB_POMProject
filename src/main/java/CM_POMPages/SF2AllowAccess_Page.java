package CM_POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AutomationConstants.CMAutomationConstants;

public class SF2AllowAccess_Page implements CMAutomationConstants
{
  private WebDriver driver;
  
  @FindBy(xpath="//input[@id='oaapprove']")
  private WebElement allow;
  
  public SF2AllowAccess_Page(WebDriver driver)
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  public void allowAccess()
  {
	  allow.click();
  }
}
