package Sample_Repo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Program2 {
	@Ignore
	@Test(priority=1,invocationCount=5)
	public void createUser()
	{
		System.out.println("cu");
	}
	@Test(priority=2,invocationCount=0)
	public void modifyUser()
	{
		System.out.println("mu");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("du");
	

}
}
