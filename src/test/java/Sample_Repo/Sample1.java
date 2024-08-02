package Sample_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

import genaric.Library.BaseClass;

@Listeners(genaric.Library.ListnersimplementetionClass.class)
public class Sample1 {
        public class sample1 extends BaseClass
        {
        	public void loginOperationCrossCheck()
        	{
        	 driver.findElement(By.xpath("hihfynk")).click();
        	}
        }
}
