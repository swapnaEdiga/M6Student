package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 *  this is pom class to click on create org Button
 */
public class OraganizationPage {

	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createNewOrgButton;
	
	public WebElement getCreateNewOrgButton() {
		return createNewOrgButton;
	}
	public OraganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	/**
	 * business lib to click on create new organization
	 */

	   public void clickOncreateOrgButton()
	   {
		   createNewOrgButton.click();
	   }
}
