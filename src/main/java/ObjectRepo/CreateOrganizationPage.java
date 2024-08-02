package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	
    @FindBy(xpath="//input[@name='accountname']")
    private WebElement OrgName;
    
    @FindBy(xpath="//input[@name='website']")
    private WebElement Website;
    
    @FindBy(xpath="//input[@name='employees']")
    private WebElement Employees;
    
    @FindBy(xpath="//input[@name='phone']")
    private WebElement Phone;
    
    @FindBy(xpath="//input[@name='otherphone']")
    private WebElement Otherphone;
    
    @FindBy(xpath="//input[@name='email1']")
    private WebElement Email;
    
    @FindBy(xpath="//textarea[@name='bill_street']")
    private WebElement BillingAddress;
    
    @FindBy(xpath="//input[@name='bill_city']")
    private WebElement BillingCity;
    
    @FindBy(xpath="//input[@name='bill_state']")
    private WebElement BillingState;
    
    @FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
    private WebElement SaveBtn;

	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrgName() {
		return OrgName;
	}

	public WebElement getWebsite() {
		return Website;
	}

	public WebElement getEmpNo() {
		return Employees;
	}

	public WebElement getPhNo() {
		return Phone;
	}

	public WebElement getOtherphNo() {
		return Otherphone;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getBillingCity() {
		return BillingCity;
	}

	public WebElement getBillingState() {
		return BillingState;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
    
    /**
     *  Business lib to create new Organozation with mandatory fields
     *  @param orgName
     *  @param website
     *  @param employess 
     */
	 public void createOrganization(String orgName,String website,String employees)
	 {
		 OrgName.sendKeys(orgName);
		 Website.sendKeys(website);
		 Employees.sendKeys(employees);
		 SaveBtn.click();
		 
	 }
	 /**
	  * Business lib to create new organazation with e address
	  * @param OrgName
	  * @param Website
	  * @param Phone
	  * @param otherName
	  * @param mailId
	  */
	 public void createOrganization(String orgName,String website,String phone,String otherPhone,String mailId)
      {
			 OrgName.sendKeys(orgName);
	         Website.sendKeys(website);
			 Phone.sendKeys(phone);
			 Otherphone.sendKeys(otherPhone);
			 Email.sendKeys(mailId);
			 SaveBtn.click();
	}
	 /**
	  *  Business lib to create new organization with employee address
	  * @param orgName 
	  * @param Website
	  * @param employess
	  * @param Baddress
	  * @param Bcity
	  * @param Bstate
	  */ 
	 public void createOrganization(String orgName,String website,String employees,String Baddress,String Bcity,String Bstate)
	 {
		 OrgName.sendKeys(orgName);
		 Website.sendKeys(website);
		 Employees.sendKeys(employees);
		 BillingAddress.sendKeys(Baddress);
		 BillingCity.sendKeys(Bcity);
		 BillingState.sendKeys(Bstate);
		 SaveBtn.click();
		 
     }
	 /**
	  * Business lib to create new organization with all the creds
	  * @param OrgName
	  * @param Website
	  * @param employess
	  * @param Phone
	  * @param otherName
	  * @param mailId
	  * @param Baddress
	  * @param Bcity
	  * @param Bstate
	  */
	 public void createOrganization(String orgName,String website,String employees,String phone,String otherPhone,
			 String mailId,String Baddress,String Bcity,String Bstate)
	 {
		 OrgName.sendKeys(orgName);
         Website.sendKeys(website);
         Employees.sendKeys(employees);
         Phone.sendKeys(phone);
		 Otherphone.sendKeys(otherPhone);
		 Email.sendKeys(mailId);
		 BillingAddress.sendKeys(Baddress);
		 BillingCity.sendKeys(Bcity);
		 BillingState.sendKeys(Bstate);
		 SaveBtn.click();
		 
		 
	 }
}
