package testcase_repo;

import org.testng.annotations.Test;

import ObjectRepo.CreatingLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadPage;
import genaric.Library.BaseClass;
import genaric.Library.ExcelUtilityOrLib;
import genaric.Library.JavaLibrary;

public class LE_01  extends BaseClass 
{
	@Test(groups= {"regression"})
		public void le01TC() throws Exception
		{
			JavaLibrary JUTIL=new JavaLibrary();
			int num=JUTIL.generateRandomnumber(1000);
			ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
			String FNAME=EUTIL.ReadingDataFromExcel("Lead",1,1);
			String LNAME=EUTIL.ReadingDataFromExcel("Lead",1,2);
			String COMP=EUTIL.ReadingDataFromExcel("Lead",1,3);
			
			HomePage hp=new HomePage(driver);
			hp.clickOnLeads();
			LeadPage lp=new LeadPage(driver);
			lp.clickonCreateLeadButton();
			
			
			
			CreatingLeadPage CNL=new CreatingLeadPage(driver);
			CNL.createLead(FNAME, LNAME, COMP);
			System.out.println("LE_01 execution suceessfull");
			Thread.sleep(3000);
		}
	}
	


