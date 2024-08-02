package genaric.Library;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListnersimplementetionClass implements ITestListener {
	
	public SeleniumUtility stil=new SeleniumUtility()
    {
	@override
	public void onTestStart(ITestResult result)
	{
	String methodName=result.getMethod().getMethodName();
	Reporter.log(methodName+"execution starts");
	}
	 @override
	 public void onTestSucess(ITestResult result)
	 {
		 String methodName=result.getMethod().getMethodName();
		 Reporter.log(methodName+"execution pass");
	 }
	 @override
	 public void onTestFailure(ITestResult result)
	 {
		 String methodName=result.getMethod().getMethodName();
		 TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
		 Files src=ts.getScreenshotAs(OutputType.FILE);
		 Files dest=new File();
		 try
		 {
			 Files.copy(src,dest);
		 }
		 catch(IOException e)
		 {
			 
		 }
	
	
   
    
	 }
    }
}

