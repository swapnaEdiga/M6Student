package simple.Lib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String expectedPage="http://localhost:8888/index.php?action=index&module=Home";
		String currentWebPage=driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		WebElement element=driver.findElement(By.xpath("//input[@name='user_password']"));
		element.sendKeys("root");
		element.submit();
		if(currentWebPage.contains(expectedPage))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ediga");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kadirisani swapna");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("qspiders");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8688772004");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9908449339");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ekswapna2@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='lane']")).sendKeys("vengalamma cheruvu,puttaparthi,anatapur");
		driver.findElement(By.xpath("//input[@id='code']")).sendKeys("515144");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='pobox']")).sendKeys("vengalamma cheruvu");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Anatapur");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Andhra Pradesh");
		driver.findElement(By.xpath("//select[@name='leadsource']")).click();
		driver.findElement(By.xpath("//option[@value='Employee']")).click();
		driver.findElement(By.xpath("//select[@name='industry']")).click();
		driver.findElement(By.xpath("//option[@value='Banking']")).click();
		driver.findElement(By.xpath("//select[@name='leadstatus']")).click();
		driver.findElement(By.xpath("//option[@value='Contacted']")).click();
		driver.findElement(By.xpath("//select[@name='rating']")).click();
		driver.findElement(By.xpath("//option[@value='Active']")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
