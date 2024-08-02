package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContact {
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='title']")
    private WebElement title;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement SaveBtn;

	public CreateNewContact(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	/**
	 * this method is to create contacts
	 * 
	 * @param fname
	 * @param lname 
	 * @param ttl
	 */
	public void cretaeContact(String fName,String lName,String ttl)
	{
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		SaveBtn.click();
	}

	public void Create(String string, String lNAME, String tITLE2) {
		// TODO Auto-generated method stub
		
	}
	
}
