package testcase_repo;

import org.testng.annotations.Test;

import ObjectRepo.CreateOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OraganizationPage;
import genaric.Library.BaseClass;
import genaric.Library.ExcelUtilityOrLib;
import genaric.Library.JavaLibrary;

public class ORG_04 extends BaseClass
{
	 @Test(groups= {"sanity"})
	   public void org03() throws Exception 
	   {
		   JavaLibrary JUTIL=new JavaLibrary();
		   int num=JUTIL.generateRandomnumber(1000);
		   ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		   String ORGNAME=EUTIL.ReadingDataFromExcel("Organization",11, 1);
		   String WEBSITE=EUTIL.ReadingDataFromExcel("Organization",11, 2);
		   String EMP=EUTIL.ReadingDataFromExcel("Organization", 11, 3);  
		   String PHN=EUTIL.ReadingDataFromExcel("Organization", 11, 4);
		   String OTHPHN=EUTIL.ReadingDataFromExcel("Organization", 11, 5);
		   String EMAIL=EUTIL.ReadingDataFromExcel("Organization", 11, 6);
		   String BILLADD=EUTIL.ReadingDataFromExcel("Organization", 11, 7);
		   String BILLCITY=EUTIL.ReadingDataFromExcel("Organization", 11, 8);
		   String BILLSTATE=EUTIL.ReadingDataFromExcel("Organization", 11, 9);
		   
		   HomePage hp=new HomePage(driver);
		   hp.clickOnOrg();
		   OraganizationPage op=new OraganizationPage(driver);
		   op.clickOncreateOrgButton();
		   
		   CreateOrganizationPage cop=new CreateOrganizationPage(driver);
		   cop.createOrganization(ORGNAME,WEBSITE,EMP,PHN,OTHPHN,EMAIL,BILLADD,BILLCITY,BILLSTATE);
		   System.out.println("ORG_04 execution successfull");
		   Thread.sleep(3000);

		   
		   
		   
}
}