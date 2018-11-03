package CM_POMPages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AutomationConstants.CMAutomationConstants;
import CM_Generics.ReadProperties;

public class SF3Dashboard_Page 
{
   private WebDriver driver;
   
   @FindBy(xpath="//a[@title='Profile picture']//span[@title='Expand']")
   public WebElement profileExpand;
   
   
   @FindBy(xpath="//a[@title='Sign Out']//span[@class='ng-scope'][contains(text(),'Sign Out')]")
   public WebElement signOut;
   
   public SF3Dashboard_Page(WebDriver driver)
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void logout()
   {
	   profileExpand.click();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   signOut.click();
   }
}
