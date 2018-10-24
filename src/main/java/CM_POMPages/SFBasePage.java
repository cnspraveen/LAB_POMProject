package CM_POMPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import AutomationConstants.CMAutomationConstants;
import CM_Generics.ReadProperties;

public class SFBasePage implements CMAutomationConstants
{
    private WebDriver driver;
    
    @FindBy(xpath="//a[@title='Profile picture']//span[@title='Expand']")
    private WebElement profileExpand;
    
    @FindBy(xpath="//a[@title='Profile']//span[@class='ng-scope'][contains(text(),'Profile')]")
      private WebElement profileOption;
    
    @FindBy(xpath="//a[@title='Sign Out']//span[@class='ng-scope'][contains(text(),'Sign Out')]")
    private WebElement signOut;
    
    @FindBy(xpath="//div[@class='dropdown-backdrop']")
    private WebElement supportExpand;
    
    @FindBy(xpath="//span[@class='support-menu ng-scope'][contains(text(),'Ask a Question')]")
    private WebElement askAQuestionOption;
    
    public  SFBasePage(WebDriver driver)
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

    public void profile() throws InterruptedException
    {
    	 profileExpand.click();
    	 profileOption.click();
    	 Thread.sleep(2000);
     }
     
     public void askAQuestion()
     {
    	 supportExpand.click();
    	 askAQuestionOption.click();
     }
}
