package testcase_repo;

import org.testng.annotations.Test;

import ObjectRepo.CreateOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OraganizationPage;
import genaric.Library.BaseClass;
import genaric.Library.ExcelUtilityOrLib;
import genaric.Library.JavaLibrary;

public class ORG_03 extends BaseClass
{
   @Test(groups= {"sanity"})
   public void org03() throws Exception 
   {
	   JavaLibrary JUTIL=new JavaLibrary();
	   int num=JUTIL.generateRandomnumber(1000);
	   ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
	   String ORGNAME=EUTIL.ReadingDataFromExcel("Organization", 8, 1);
	   String WEBSITE=EUTIL.ReadingDataFromExcel("Organization", 8, 2);
	   String BILLADD=EUTIL.ReadingDataFromExcel("Organization", 8, 3);
	   String BILLCITY=EUTIL.ReadingDataFromExcel("Organization", 8, 4);
	   String BILLSTATE=EUTIL.ReadingDataFromExcel("Organization", 8, 5);
	   
	   HomePage hp=new HomePage(driver);
	   hp.clickOnOrg();
	   OraganizationPage op=new OraganizationPage(driver);
	   op.clickOncreateOrgButton();
	   
	   CreateOrganizationPage cop=new CreateOrganizationPage(driver);
	   cop.createOrganization(ORGNAME,WEBSITE,BILLADD,BILLCITY,BILLSTATE);
	   System.out.println("ORG_02 execution successfull");
	   Thread.sleep(3000);
	   
   }
}
