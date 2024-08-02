package testcase_repo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepo.CreatingLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadPage;
import genaric.Library.BaseClass;
import genaric.Library.ExcelUtilityOrLib;

public class LE_04 extends BaseClass
{
   @Test(groups= {"smoke"})
   public void le04tc() throws Exception
   {
	   ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		String FNAME=EUTIL.ReadingDataFromExcel("Leads",11, 1);
		String LNAME=EUTIL.ReadingDataFromExcel("Leads",11, 2);
		String CNAME=EUTIL.ReadingDataFromExcel("Leads",11, 3);
		String st=EUTIL.ReadingDataFromExcel("Leads",11, 4);
		String POBOX=EUTIL.ReadingDataFromExcel("Leads",11, 5);
		String PCode=EUTIL.ReadingDataFromExcel("Leads",11, 6);
		String city=EUTIL.ReadingDataFromExcel("Leads",11, 7);
		String country=EUTIL.ReadingDataFromExcel("Leads",11, 8);
		String state=EUTIL.ReadingDataFromExcel("Leads",11, 9);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp=new LeadPage(driver);
		lp.clickonCreateLeadButton();
		CreatingLeadPage CNL=new CreatingLeadPage(driver);
		CNL.createLead(FNAME, LNAME, CNAME, st, POBOX, PCode, city, country, state);
		System.out.println("LE_04 execution successfull");
		Thread.sleep(3000);
   }
}
