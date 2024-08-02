package testcase_repo;

import org.testng.annotations.Test;

import ObjectRepo.CreateOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OraganizationPage;
import genaric.Library.BaseClass;
import genaric.Library.ExcelUtilityOrLib;
import genaric.Library.JavaLibrary;

public class ORG_02 extends BaseClass 
{
  @Test(groups= {"smoke"})  
  public void org02() throws Exception 
  {
	  JavaLibrary JUTIL=new JavaLibrary();
	   int num=JUTIL.generateRandomnumber(1000);
	   ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
	   String ORGNAME=EUTIL.ReadingDataFromExcel("Organization", 5, 1);
	   String WEBSITE=EUTIL.ReadingDataFromExcel("Organization", 5, 2);
	   String EMP=EUTIL.ReadingDataFromExcel("Organization", 5, 3);  
	   String PHN=EUTIL.ReadingDataFromExcel("Organization", 5, 4);
	  String OTHPHN=EUTIL.ReadingDataFromExcel("Organization", 5, 5);
	  String EMAIL=EUTIL.ReadingDataFromExcel("Organization", 5, 6);
	  
	  HomePage hp=new HomePage(driver);
	  hp.clickOnOrg();
	  OraganizationPage op=new OraganizationPage(driver);
	  op.clickOncreateOrgButton();
	  
	  
	  
	  CreateOrganizationPage cop=new CreateOrganizationPage(driver);
	  cop.createOrganization(ORGNAME+num,WEBSITE,EMP,PHN,OTHPHN,EMAIL);
	  System.out.println("ORG_02 execution successfull");
	  Thread.sleep(3000);
  }
}
