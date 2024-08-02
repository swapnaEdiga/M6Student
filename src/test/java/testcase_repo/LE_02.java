package testcase_repo;

import org.testng.annotations.Test;

import ObjectRepo.CreatingLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadPage;
import genaric.Library.BaseClass;
import genaric.Library.ExcelUtilityOrLib;


public class LE_02 extends BaseClass
{
	@Test(groups= {"regression"})
	public void le02tc() throws Exception
	{
		ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		String FNAME=EUTIL.ReadingDataFromExcel("Leads",5, 1);
		String LNAME=EUTIL.ReadingDataFromExcel("Leads",5, 2);
		String CNAME=EUTIL.ReadingDataFromExcel("Leads",5, 3);
		String TITLE=EUTIL.ReadingDataFromExcel("Leads",5, 4);
		String Phone=EUTIL.ReadingDataFromExcel("Leads",5, 5);
		String Mobile=EUTIL.ReadingDataFromExcel("Leads",5, 6);
		String Email=EUTIL.ReadingDataFromExcel("Leads",5, 7);
		String NOE=EUTIL.ReadingDataFromExcel("Leads",5, 8);
		String st=EUTIL.ReadingDataFromExcel("Leads",5, 9);
		String POBOX=EUTIL.ReadingDataFromExcel("Leads",5, 10);
		String PCode=EUTIL.ReadingDataFromExcel("Leads",5, 11);
		String city=EUTIL.ReadingDataFromExcel("Leads",5, 12);
		String country=EUTIL.ReadingDataFromExcel("Leads",5, 13);
		String state=EUTIL.ReadingDataFromExcel("Leads",5, 14);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp=new LeadPage(driver);
		lp.clickonCreateLeadButton();
		CreatingLeadPage CNL=new CreatingLeadPage(driver);
		CNL.createLead(FNAME, LNAME,CNAME,TITLE,Phone,Mobile,Email,NOE,st,POBOX,PCode,city,country,state);
		System.out.println("LE_02 execution successfull");
		Thread.sleep(3000);
	}
}
