package Sample_Repo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class program5 {
	@Test
	public void Strictlevelcomparision()
	{
	    String ExpectedValue="raja";
	    String actualValue="Raja";
	    
	    SoftAssert sf=new SoftAssert();
	    sf.assertEquals(actualValue,ExpectedValue);
	    System.out.println("assertion passed");
	    sf.assertAll();
	}
     @Test
     public void containslevel() {
    	 String expectedValue="raja";
    	 String actualValue="maharaja";
    	 SoftAssert sf=new SoftAssert();
 	     sf.assertTrue(actualValue.contains(expectedValue));
 	    System.out.println("contains passed");
	    sf.assertAll();
     }
}
