package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatingLeadPage {
		  
		  @FindBy(xpath="//input[@name='firstname']")
		  private WebElement firstname;
		  
		  @FindBy(xpath="//input[@name='lastname']")
		  private WebElement lastname;
		  
		  @FindBy(xpath="//input[@name='company']")
		  private WebElement company;
		  
		  @FindBy(xpath="//input[@name='designation']")
		  private WebElement title;
		  
		  @FindBy(xpath="//input[@name='phone']")
		  private WebElement phone;
		  
		  @FindBy(xpath="//input[@name='mobile']")
		  private WebElement mobile;
		  
		  @FindBy(xpath="//input[@name='email']")
		  private WebElement email;
		  
		  @FindBy(xpath="//input[@name='noofemployees']")
		  private WebElement noOfEmp;
		  
		  @FindBy(xpath="//textarea[@name='lane']")
		  private WebElement street;
		  
		  @FindBy(xpath="//input[@name='pobox']")
		  private WebElement poBox;
		  
		  @FindBy(xpath="//input[@name='code']")
		  private WebElement postalCode;
		  
		  @FindBy(xpath="//input[@name='city']")
		  private WebElement city;
		  
		  @FindBy(xpath="//input[@name='country']")
		  private WebElement country;
		  
		  @FindBy(xpath="//input[@name='state']")
		  private WebElement state;
		  
		  @FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
		  private WebElement saveBtn;
		  public CreatingLeadPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
		}
		/**
		   * Business logic
		   * @param fname
		   * @param lname
		   * @param comp
		   */
		    public void createLead(String fname,String lname,String comp)
		    {
		    	firstname.sendKeys(fname);
		    	lastname.sendKeys(lname);
		    	company.sendKeys(comp);
		    	saveBtn.click();
		    }
		    /**
		     * this is business library to create lead with all creds
		     * @param fname
		     * @param lname
		     * @param comp
		     * @param desg
		     * @param phNo
		     * @param mob
		     * @param mailId
		     * @param employees
		     * @param strt
		     * @param pb
		     * @param postcode
		     * @param cty
		     * @param cntry
		     * @param st
		     */
		    public void createLead(String fname,String lname,String comp,String desg,String phNo,String mob,
		    		String mailId,String employees,String strt,String pb,String postcode,String cty,String cntry,String st)
		    {
		    	firstname.sendKeys(fname);
		    	lastname.sendKeys(lname);
		    	company.sendKeys(comp);
		    	title.sendKeys(desg);
		    	phone.sendKeys(phNo);
		    	mobile.sendKeys(mob);
		    	email.sendKeys(mailId);
		    	noOfEmp.sendKeys(employees);
		    	street.sendKeys(strt);
		    	poBox.sendKeys(pb);
		    	postalCode.sendKeys(postcode);
		    	city.sendKeys(cty);
		    	country.sendKeys(cty);
		    	state.sendKeys(st);
		    	saveBtn.click();
		    	
		    }
		    /** this is business library to create lead with emloye  creds
		     * @param fname
		     * @param lname
		     * @param comp
		     * @param desg
		     * @param phNo
		     * @param mob
		     * @param mailId
		     * @param employees
		     */
		    public void createLead(String fname,String lname,String comp,String desg,String phNo,String mob,String mailId,String employees)
		    {
		    	firstname.sendKeys(fname);
		    	lastname.sendKeys(lname);
		    	company.sendKeys(comp);
		    	title.sendKeys(desg);
		    	phone.sendKeys(phNo);
		    	mobile.sendKeys(mob);
		    	email.sendKeys(mailId);
		    	noOfEmp.sendKeys(employees);
		    	saveBtn.click();
		    }
		       /** this is business library to create lead With employee address
	     	     * @param fname
		         * @param lname
		         * @param comp
		         * @param strt
		         * @param pb
		         * @param postcode
	             * @param cty
		         * @param cntry
		         * @param st
		       */
		        public void createLead(String fname,String lname,String comp,String strt,String pb,String postcode,String cty,String cntry,String st)
		        {
		        	firstname.sendKeys(fname);
			    	lastname.sendKeys(lname);
			    	company.sendKeys(comp);
			    	street.sendKeys(strt);
			    	poBox.sendKeys(pb);
			    	postalCode.sendKeys(postcode);
			    	city.sendKeys(cty);
			    	country.sendKeys(cty);
			    	state.sendKeys(st);
			    	saveBtn.click();
		         
	  }
		        
	  }


