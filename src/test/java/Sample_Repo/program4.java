package Sample_Repo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class program4 {
	
	@Test
	public void Strictlevelcomparision()
	{
		String ExpectedValue="raja";
		String actualValue="raja";
		Assert.assertEquals(actualValue,ExpectedValue);
		System.out.println("assertion passed");
	}
	@Test
	public void containslevel()
	{
		String expectedValue="raja";
		String actualValue="maharaja";
		Assert.assertTrue(actualValue.contains(expectedValue));
		System.out.println("contains passed");
	}

}
