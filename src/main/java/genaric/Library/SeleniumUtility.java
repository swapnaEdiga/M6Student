package genaric.Library;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility {
	public Actions act=null;
	public Select s=null;
	/*
	 *  this method is to maximize the window
	 *  
	 *  @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 *  this method is using for implicit wait
	 *  
	 *  @param driver
	 *  @param time
	 */
	  public void implicitWait(WebDriver driver,int time)
	  {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
       /**
        * this method is use to move to a particular element 
        * @param driver
        * @param element 
        */
	  public void movingTowardsAnElement(WebDriver driver,WebElement element)
	  {
		act=new Actions(driver);
		act.moveToElement(element).perform();
	  }
	  /**
	   * this method is use to perform right click operation
	   * @param driver
	   * @param element
	   */
	    public void rightClick(WebDriver driver,WebElement element)
	    {
	    	act=new Actions(driver);
	    	act.contextClick(element).perform();
	    }
	    /**
	     * this method is use to click on an element 
	     * @param driver
	     * @param element
	     */
	    public void clickOnElement(WebDriver driver,WebElement element)
	    {
	    	act=new Actions(driver);
	    	act.click(element).perform();
	    }
	    /**
	     *  this method is use to scroll to a particular element
	     *  @param driver
	     *  @param element
	     */
	    public void scrollToAparticularElement(WebDriver driver,WebElement element)
	    {
	    	act=new Actions(driver);
	    	act.scrollToElement(element).perform();
	    }
	    /**
	     *  this method is use to drag an element to its destination
	     *  @param driver
	     *  @param src
	     *  @param dest
	     */
	    public void dragSrcToDest(WebDriver driver,WebElement src,WebElement dest) {
	    	act=new Actions(driver);
	    	act.dragAndDrop(src, dest).perform();
	    }
	    /**
	     * this method is use to drag a pointer
	     * @param driver
	     * @param sec
	     * @param x
	     * @param y
	     */
	    public void dragPointer(WebDriver driver,WebElement src,int x,int y) {
	    	act=new Actions(driver);
	    	act.dragAndDropBy(src, x, y).perform();
	    }
	    /**
	     * this method is use to click and hold
	     * @param driver
	     * @param element
	     */
	    public void clickAndHold(WebDriver driver,WebElement element) {
	    	act=new Actions(driver);
	    	act.clickAndHold().perform();
	    }
	    /**
	     * this method is use to release an element
	     * @param driver
	     * @param element
	     */
	    public void releaseAnElement(WebDriver driver,WebElement element) {
	    	act=new Actions(driver);
	    	act.release().perform();
	    }
	    /**
	     * this method is use to select an option from Drop down based on index
	     * @param element
	     * @param indexNo
	     */
	    public void selectAnElementBasedOnIndex(WebElement element,int indexNo) {
	    	s=new Select(element);
	    	s.selectByIndex(indexNo);
	    }
	    /**
	     * this method is use to select an option from Drop down based on att
	     * @param element
	     * @param value
	     */
	    public void selectAnElementBasedOnValueAttribute(WebElement element,String value) {
	    	s=new Select(element);
	    	s.selectByValue(value);
	    }
	    /**
	     * this method is use to select an option from Drop down based on visible text
	     * @param element
	     * @param text
	     */
	    public void selectAnElementBasedOnVisibleText(WebElement element,String text) {
	    	s=new Select(element);
	    	s.selectByVisibleText(text);
	    }
	    /**
	     * this method will give all the options
	     * @param element
	     * @return
	     */
	    public List<WebElement> getAllOptionsFromDropDown(WebElement element) {
	         s=new Select(element);
	         List<WebElement> options=s.getOptions();
	         return options;
	    }
	    /**
	     *  this method will give all the selected options
	     * @param element
	     * @return
	     */
	    public List<WebElement> getAllSelectedOptionsFromDropDown(WebElement element) {
	         s=new Select(element);
	         List<WebElement> options=s.getAllSelectedOptions();
	         return options;
	    }
	    /**
	     * this method is use to de select an option from Drop down based on index
	     * @param element
	     * @param indexNo
	     */
	   public void deselectAnElementBasedOnIndex(WebElement element,int indexNo) {
	    	s=new Select(element);
	    	s.deselectByIndex(indexNo);
	    }
	    /**
	     * this method is use to de select an option from Drop down based on att
	     * @param element
	     * @param value
	     */
	    public void deselectAnElementBasedOnValueAttribute(WebElement element,String value) {
	    	s=new Select(element);
	    	s.deselectByValue(value);
	    }
	    /**
	     * this method is use to de select an option from Drop down based on visible yext
	     * @param element
	     * @param text
	     */
	    public void deselectAnElementBasedOnVisibleText(WebElement element,String text) {
	    	s=new Select(element);
	    	s.deselectByVisibleText(text);
	    }
	    /**
	     * to Deselect all options
	     * @param element 
	     */
	   public void deselectAllOptions(WebElement element) {
		   s=new Select(element);
		   s.deselectAll();
	   }
	   /**
	    * this method will help to accept the alert
	    * @param driver
	    */
	   public void toAcceptAlert(WebDriver driver) {
		   Alert alt=driver.switchTo().alert();
		   alt.accept();
	   }
	   /**
	    * this method will help to dismiss the alert msg
	    * @param driver
	    */
	   public void toDismissAlert(WebDriver driver) {
		   Alert alt=driver.switchTo().alert();
		   alt.dismiss();
	   }
	   /** this method will help to pass the alert msg
	    * @param driver
	    * @param msg
	    */
	   public void toPassAlertMsg(WebDriver driver,String msg) {
	    	Alert alt=driver.switchTo().alert();
	    	alt.sendKeys(msg);
	    }
	    /** this method will help to read the alert msg
	    * @param driver
	    * @return
	    */
	   public String toFetchAlertMsg(WebDriver driver)
	   {
		   Alert alt=driver.switchTo().alert();
		   String alertMsg=alt.getText();
		   return alertMsg;
	   }
	   /**
	    * this method will help us to perform is operations
	    * @param driver
	    * @param value
	    */
	   public void operationsWithJs(WebDriver driver,String value) {
		   JavascriptExecutor jse=(JavascriptExecutor)driver;
		   jse.executeScript(value);
	   }
	   /**
	    * this method is use to capture the Screenshot
	    * @param driver
	    * @param path
	    * @param Exception
	    * @throws Exception 
	    */
	   public void captureScreenShot(WebDriver driver,String path) throws Exception
	   {
		   TakesScreenshot ts=(TakesScreenshot)driver;
		   File src=ts.getScreenshotAs(OutputType.FILE);
		   File dest=new File(path);
		   Files.copy(src, dest);
	   }
	   /**
	    * custom click
	    * @param driver
	    * @param element
	    * @param time
	 * @throws Exception 
	    * @throws Exception
	    */
	   public void ifElementClickFails(WebDriver driver,WebElement element ,int time) throws Exception {
		   int count=0;
		   int reclickCount=5;
		   while(count<=reclickCount) {
			   element.click();
			   Thread.sleep(time);
			   break;
		   }
	   }
	   /**
	    * this method is to handle the window popup
	    * @param driver
	    */
	   public void windowpopUpHandle(WebDriver driver) {
		   String parentwindow=driver.getWindowHandle();
		   Set<String> allwindow=driver.getWindowHandles();
		   
		   Iterator<String> itr=allwindow.iterator();
		   while(itr.hasNext()) {
			   String values=itr.next();
			   String title=driver.switchTo().window(values).getTitle();
			   
			   if(title.contains(values)) {
				   break;
			   }
		   }
		   }
	   
}

