package testcase_repo;

import org.testng.annotations.Test;

import ObjectRepo.CreateOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OraganizationPage;
import genaric.Library.BaseClass;
import genaric.Library.ExcelUtilityOrLib;
import genaric.Library.JavaLibrary;


@Test
public class ORG_01 extends BaseClass
{
	@Test(groups= {"regression"})
	public void org01() throws Exception
   {
	   JavaLibrary JUTIL=new JavaLibrary();
	   int num=JUTIL.generateRandomnumber(1000);
	   ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
	   String ORGNAME=EUTIL.ReadingDataFromExcel("Organization", 2, 1);
	   String WEBSITE=EUTIL.ReadingDataFromExcel("Organization", 2, 2);
	   String EMP=EUTIL.ReadingDataFromExcel("Organization", 2, 3);
	   
	  HomePage hp=new HomePage(driver);
	  hp.clickOnOrg();
	  OraganizationPage op=new OraganizationPage(driver);
	  op.clickOncreateOrgButton();
	  
	  CreateOrganizationPage cop=new CreateOrganizationPage(driver);
	  cop.createOrganization(ORGNAME+num,WEBSITE,EMP);
	  System.out.println("ORG_01 execution successfull");
	  Thread.sleep(3000);
   }
}
