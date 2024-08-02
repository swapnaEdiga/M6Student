package testcase_repo;

import org.testng.annotations.Test;

import ObjectRepo.ContactPage;
import ObjectRepo.CreateNewContact;
import ObjectRepo.HomePage;
import genaric.Library.BaseClass;
import genaric.Library.ExcelUtilityOrLib;
import genaric.Library.JavaLibrary;

public class CON_01 extends BaseClass 
{
	@Test(retryAnalyzer=genaric.Library.RetryAnalyzerImplementationclass.class)
	
	public void con_01() throws Exception
	{
		JavaLibrary JLIB=new JavaLibrary();
		   int num=JLIB.generateRandomnumber(1000);
		   ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		   String FNAME=EUTIL.ReadingDataFromExcel("Contacts", 1, 1);
		   String LNAME=EUTIL.ReadingDataFromExcel("Contacts", 1, 2);
		   String TITLE=EUTIL.ReadingDataFromExcel("Contacts", 1, 3);
		   
		   HomePage hp=new HomePage(driver);
		   hp.clickOnContacts();
		   ContactPage cp=new ContactPage(driver);
		   cp.clickOnCreateContactButton();
		   CreateNewContact cnc=new CreateNewContact(driver);
		   cnc.Create(FNAME+num,LNAME,TITLE);
		   Thread.sleep(3000);
		   
	}

}
