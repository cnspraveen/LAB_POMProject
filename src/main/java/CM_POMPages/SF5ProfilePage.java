package CM_POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import AutomationConstants.CMAutomationConstants;
import CM_Generics.ReadProperties;

public class SF5ProfilePage extends SFBasePage
{
   private WebDriver driver;
   
   @FindBy(xpath="//span[@class='segmented-text ng-scope'][contains(text(),'Preferences')]")
 //segmented-control[@class='ng-isolate-scope']//button[2]
  // //span[contains(text(),'Preferences')]
      private WebElement preferenceTab;
   
   @FindBy(xpath="//div[@class='slider round']")
   public WebElement toggleButtonInPrefTab;
   
  @FindBy(xpath="//span[@class='segmented-text ng-scope'][contains(text(),'Profile')]")
   public WebElement profileTab;
   
   @FindBy(xpath="//span[@class='favorite-star cm-icon-outline-star brand-color-pri']")
   		//"//span[@class='favorite-star cm-icon-filled-star brand-color-pri']")
	   //"//span[@class='favorite-star cm-icon-outline-star brand-color-pri']")
    public WebElement favoriteIcon;
   
   @FindBy(xpath="//span[@class='favorite-star cm-icon-filled-star brand-color-pri']")
                                   //span[@class='favorite-star cm-icon-filled-star brand-color-pri']
                                  //span[@class='favorite-star cm-icon-outline-star brand-color-pri']
    public WebElement UnfavoriteIcon;
   
   @FindBy(xpath="//div[@class='popover-content']//input[@type='text']")
   public WebElement favouriteName;
   
   @FindBy(xpath="//div[@class='popover-content']//button[@class='cm-btn cm-btn-primary ng-scope'][contains(text(),'Save')]")
   public WebElement favSaveButton;
   
   public SF5ProfilePage(WebDriver driver)
   {
	   super(driver);
	   this.driver =driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void toggleEmailNotfication() throws InterruptedException
   {
	   preferenceTab.click();
	   Thread.sleep(2000);
	   toggleButtonInPrefTab.click();
	   Thread.sleep(2000);
	   profileTab.click();
   }
   public void favouriteProfile() throws InterruptedException
   {
	   favoriteIcon.click();
	   favouriteName.clear();
	   favouriteName.sendKeys(ReadProperties.getPropValue(CMAutomationConstants.propfilepath, "profilePageName"));
	   Thread.sleep(5000);
	   favSaveButton.click();
	   //Thread.sleep(11000);   
	   //UnfavoriteIcon.click();
   }
}
