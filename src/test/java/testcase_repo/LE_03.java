package testcase_repo;

import org.testng.annotations.Test;

import ObjectRepo.CreatingLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadPage;
import genaric.Library.BaseClass;
import genaric.Library.ExcelUtilityOrLib;

public class LE_03 extends BaseClass
{
   @Test(groups= {"sanity"})
   public void le03tc() throws Exception 
   {
	   ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		String FNAME=EUTIL.ReadingDataFromExcel("Leads",8, 1);
		String LNAME=EUTIL.ReadingDataFromExcel("Leads",8, 2);
		String CNAME=EUTIL.ReadingDataFromExcel("Leads",8, 3);
		String TITLE=EUTIL.ReadingDataFromExcel("Leads",8, 4);
		String Phone=EUTIL.ReadingDataFromExcel("Leads",8, 5);
		String Mobile=EUTIL.ReadingDataFromExcel("Leads",8, 6);
		String Email=EUTIL.ReadingDataFromExcel("Leads",8, 7);
		String NOE=EUTIL.ReadingDataFromExcel("Leads",5, 8);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp=new LeadPage(driver);
		lp.clickonCreateLeadButton();
		CreatingLeadPage CNL=new CreatingLeadPage(driver);
		CNL.createLead(FNAME, LNAME,CNAME,TITLE,Phone,Mobile,Email,NOE);
		System.out.println("LE_03 execution successfull");
		Thread.sleep(3000);
   }
}
