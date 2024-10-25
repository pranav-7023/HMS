package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@BeforeSuite
	void method1()
	{
		System.out.println("method1");
	}
	
	@BeforeTest
	void method2()
	{
		System.out.println("method2");
	}
	
	@BeforeClass
	void method3()
	{
		System.out.println("method3");
	}
	
	@BeforeMethod
	void method4()
	{
		System.out.println("method4");
	}
	
	@Test
	void method5()
	{
		System.out.println("method5");
	}
	
	@AfterMethod
	void method6()
	{
		System.out.println("method6");
	}
	
	@AfterClass
	void method7()
	{
		System.out.println("method7");
	}
	
	@AfterTest
	void method8()
	{
		System.out.println("method8");
	}
	
	@AfterSuite
	void method9()
	{
		System.out.println("method9");
	}
	
	void method10()    // since we have not associated any annotation so its not execute
	{
		System.out.println("method10");
	}
	
}
	
	
	
	
	
	
	
	
  //  @Test         //used annotations for every method we have to write(execution of method depends on this annotation)//
  //	void method()   // created a method(normal)//(we have to associate with method to annotation)//
	//{
//		System.out.println("Hello World");  //message printed//
	
		

	
