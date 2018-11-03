package CM_POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AutomationConstants.CMAutomationConstants;
import CM_Generics.ReadProperties;

public class SF6DedicatedQuickLinks_Page extends SFBasePage {
	   private WebDriver driver;
	   
	  @FindBy(xpath="//span[contains(text(),'Bookmarks')]")
	  public WebElement booksMarksTab;
	  
	   @FindBy(xpath="//span[@class='cm-p1 ng-binding'][contains(text(),'cu22Profile')]")
		public WebElement profileNameExistInQuicklinks;

	   public SF6DedicatedQuickLinks_Page(WebDriver driver)
	   {
		   super(driver);
		   this.driver = driver;
	 	   PageFactory.initElements(driver, this);
	   }
	   
	   public void booksMarksTab()
	   {
		   booksMarksTab.click();
	   }
	   
	   public String nameExistInQuickLinks() throws InterruptedException
	   {
		   Thread.sleep(3000);
		   //profileNameExistInQuicklinks.sendKeys(ReadProperties.getPropValue(CMAutomationConstants.propfilepath, "profileNameInQuicklinkspage"));	
		   return profileNameExistInQuicklinks.getText();
	   }
}
