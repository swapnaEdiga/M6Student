package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class is the home page pom class
 */
public class HomePage {
	
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leads;
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement org;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contacts;
	
	@FindBy(xpath="//table/tbody/tr/td[@class='small' and @align='right']/table/tbody/tr/td[@class='small'][1]")
	private WebElement adminHover;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logoutBtn;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
    public  WebElement getLeads() {
		return leads;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getContacts() {
		return contacts;
	}
    public WebElement getAdminHover() {
    	return adminHover;
    }
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	 
	/**
	 *  business library to click on leads
	 */
	
	    public void clickOnLeads()
	    {
	       leads.click();
	    }
	    /**
	     *  business library to click on org
	     */
	    public void clickOnOrg()
	    {
	    	org.click();
	    }
	    /**
	     * business library to click on contacts
	     */
	    
         public void clickOnContacts()
         {
        	 contacts.click();
         }
         /**
         * business library to perform logout
         *
         * @param driver
         */
         public void logoutOperation(WebDriver driver)
         {
        	 Actions act=new Actions(driver);
        	 act.moveToElement(adminHover).perform();
        	 logoutBtn.click();
         }
}
         