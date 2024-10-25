package Testng;

import org.testng.annotations.Test;

public class Innovation {

	@Test(invocationCount=10, priority = 0)   //To execute multiple time method used invocation //
	void maven()
	{
		System.out.println("This is a maven method");
	}
	
	@Test(enabled=false)  // if we don't have to execute any method used enabled parameter//  by default its true
	void java()
	{
		System.out.println("This is a java method");
	}
}
