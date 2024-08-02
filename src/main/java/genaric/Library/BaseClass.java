package genaric.Library;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;

public class BaseClass {
	public static WebDriver driver=null;
	public PropertiesUtilorLib PUTIL=null;
	public SeleniumUtility SUTIL=new SeleniumUtility();
	
	@BeforeSuite
	public void createDbconnection()
	{
		System.out.println("db connection successfully!!");
	}
	@BeforeClass
	public void launchBrowser() throws Exception
	{
	PUTIL=new PropertiesUtilorLib();
	String URL=PUTIL.getDataFromproperties("url");
	driver=new ChromeDriver();
	SUTIL.implicitWait(driver, 10);
	SUTIL.maximizeWindow(driver);
	driver.get(URL);
	System.out.println("LAUNCHING SUCCESSFILLY!!");
	}
	@BeforeMethod
	public void loginOperation() throws Exception
	{
		String USERNAME=PUTIL.getDataFromproperties("username");
		String PASSWORD=PUTIL.getDataFromproperties("password");
		LoginPage LP=new LoginPage(driver);
		LP.loginOperation(USERNAME,PASSWORD);
		System.out.println("login successfuly!!");
	}
	@AfterMethod
	public void logoutOperation()
	{
		HomePage hp=new HomePage(driver);
		hp.logoutOperation(driver);
		System.out.println("logout successfully!!");
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		System.out.println("Browser closed succesfully!!");
	}
	@AfterSuite
	public void closeDbconnections()
	{
		System.out.println("db connection closed!!");
	}
	
}
