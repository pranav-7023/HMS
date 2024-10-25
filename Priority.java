package Testng;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=0)    //Priority is a keyword//
	void Test1()
	{
		System.out.println("This is Test1");
	}
	
	@Test(priority=1)
	void Manual()
	{
		System.out.println("This is Manual");
	}
	
	@Test(priority=2)
	void Automation()
	{
		System.out.println("This is Automation");
	}
	
	@Test(priority=3)
	void Api()
	{
		System.out.println("This is Api");
	}
	
	@Test(priority=4)
	void Sql()
	{
		System.out.println("This is Sql");
	}
}
