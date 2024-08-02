package genaric.Library;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementationclass implements IRetryAnalyzer
{
    int count=1;
    int retrycount=3;
	public boolean retry(ITestResult result) {
		while(count<=retrycount)
    	{
    		count++;
    		return true;
    	}
		return false;
	}
}
